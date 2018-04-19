package logic;

import java.util.List;

import transfer.Employee;
import dataaccess.DAO;
import dataaccess.EmployeeDAO;
/**
 * Logic for processing a Employee Table to add or get them from the database
 * 
 * @author Phil Lou
 * @author Nicholas Lockhart
 *
 */
public class EmployeeLogic implements Logic<Employee> {
	/**
	 * Maximum length that the gender code can be
	 */
	private static final int GENDER_MAX_LENGTH = 1;
	/**
	 * Ensure that the length of the Employee Name is not longer than 45
	 */
	private static final int NAME_MAX_LENGTH = 45;
	
	/**
	 * DataAccess that processes the Employee
	 */
	private DAO<Employee> DAO = null;
	
	public EmployeeLogic() {
		DAO = new EmployeeDAO();
	}

	@Override
	public List<Employee> getAll() {
		return DAO.getAll();
	}

	@Override
	public void add(Employee t) {
		clean(t);
		validate(t);
		DAO.add(t);
	}

	@Override
	public void clean(Employee t) {
		if(t.getFirstName() != null) {
			t.setFirstName(t.getFirstName().trim());
		}
		if(t.getLastName() != null) {
			t.setLastName(t.getLastName().trim());
		}
		if(t.getGender() != null) {
			t.setGender(t.getGender().trim());
		}
	}

	@Override
	public void validate(Employee t) {
		validateString(t.getFirstName(), "first_name", NAME_MAX_LENGTH, false);
		validateString(t.getLastName(), "last_name", NAME_MAX_LENGTH, false);
		validateString(t.getGender(), "gender", GENDER_MAX_LENGTH, false);
	}

	@Override
	public void validateString(String value, String fieldName, int max, boolean isNullAllowed) {
		if (value == null && isNullAllowed) {
            // null permitted, nothing to validate
        } else if (value == null && !isNullAllowed) {
            throw new IllegalStateException(String.format("%s cannot be null", fieldName));
        } else if (value.isEmpty()) {
            throw new IllegalStateException(String.format("%s cannot be empty or only whitespace", fieldName));
        } else if (value.length() > max) {
            throw new IllegalStateException(String.format("%s cannot exceed %d characters", fieldName, max));
        }
	}

	
}
