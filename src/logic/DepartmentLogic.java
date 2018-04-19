package logic;

import java.util.List;

import transfer.Department;
import dataaccess.DAO;
import dataaccess.DepartmentDAO;
/**
 * Logic for processing a department to add or get them from the database
 * 
 * @author Phil Lou
 * @author Nicholas Lockhart
 *
 */
public class DepartmentLogic implements Logic<Department> {
	/**
	 * Ensure that the length of the department code is not longer than 45
	 */
	private static final int NUMBER_MAX_LENGTH = 45;
	/**
	 * Ensure that the length of the department Name is not longer than 45
	 */
	private static final int NAME_MAX_LENGTH = 45;
	
	/**
	 * DataAccess that processes the Department
	 */
	private DAO<Department> DAO = new DepartmentDAO();
	

	@Override
	public List<Department> getAll() {
		return DAO.getAll();
	}

	@Override
	public void add(Department t) {
		clean(t);
		validate(t);
		DAO.add(t);
	}

	@Override
	public void clean(Department t) {
		if(t.getCode() != null) {
			t.setCode(t.getCode().trim());
		}
		if(t.getName() != null) {
			t.setName(t.getName().trim());
		}
	}

	@Override
	public void validate(Department t) {
		validateString(t.getName(), "Dept_name", NAME_MAX_LENGTH, false);
		validateString(t.getName(), "Dept_no", NUMBER_MAX_LENGTH, false);
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
