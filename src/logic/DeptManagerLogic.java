package logic;

import java.util.List;

import transfer.DeptManager;
import dataaccess.DAO;
import dataaccess.DeptManagerDAO;
/**
 * Logic for processing a Department Manager Table to add or get them from the database
 * 
 * @author Phil Lou
 * @author Nicholas Lockhart
 *
 */
public class DeptManagerLogic implements Logic<DeptManager> {
	/**
	 * Ensure that the length of the department Name is not longer than 45
	 */
	private static final int NAME_MAX_LENGTH = 45;
	
	/**
	 * DataAccess that processes the Department Manager
	 */
	private DAO<DeptManager> DAO = null;
	
	public DeptManagerLogic() {
		DAO = new DeptManagerDAO();
	}

	@Override
	public List<DeptManager> getAll() {
		return DAO.getAll();
	}

	@Override
	public void add(DeptManager t) {
		clean(t);
		validate(t);
		DAO.add(t);
	}

	@Override
	public void clean(DeptManager t) {
		if(t.getDeptNo() != null) {
			t.setDeptNo(t.getDeptNo().trim());
		}
	}

	@Override
	public void validate(DeptManager t) {
		validateString(t.getDeptNo(), "dept_no", NAME_MAX_LENGTH, false);
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
