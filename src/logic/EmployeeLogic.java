package logic;

import java.sql.Date;
import java.util.List;

import transfer.Employee;
import dataaccess.DAO;
import dataaccess.EmployeeDAO;

public class EmployeeLogic implements Logic<Employee> {
	
	private static final int NUMBER_MAX = 999999999;
	private static final int NAME_MAX_LENGTH = 45;
	private static final int GENDER_MAX_LENGTH = 1;
	
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
