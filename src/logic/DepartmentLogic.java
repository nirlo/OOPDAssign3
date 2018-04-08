package logic;

import java.util.List;

import transfer.Department;
import dataaccess.DAO;
import dataaccess.DepartmentDAO;

public class DepartmentLogic implements Logic<Department> {
	
	private static final int NUMBER_MAX_LENGTH = 45;
	private static final int NAME_MAX_LENGTH = 45;
	
	private DAO<Department> DAO = null;
	
	public DepartmentLogic() {
		DAO = new DepartmentDAO();
	}

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
		
	}

	@Override
	public void validate(Department t) {
		validateString(t.getName(), "first_name", NAME_MAX_LENGTH, false);
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
