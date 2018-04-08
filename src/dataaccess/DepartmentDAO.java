package dataaccess;

import java.util.List;

import builder.Builder;
import transfer.Department;
import transfer.Employee;

public class DepartmentDAO implements DAO<Department> {
	
	private final String GET_ALL_DEPARTMENT = "SELECT * FROM salaries ORDER BY emp_no";
	
	private final String GET_BY_CODE_DEPARTMENT;
	
	private final String INSERT_DEPARTMENT;
	
	private final String UPDATE_DEPARTMENT;
	
	private final String DELETE_DEPARTMENT;
	
	private Builder<Department> builder;
	
	
	
	public DepartmentDAO() {
		GET_ALL_DEPARTMENT = "";
		GET_BY_CODE_DEPARTMENT = "";
		INSERT_DEPARTMENT = "";
		UPDATE_DEPARTMENT = "";
		DELETE_DEPARTMENT = "";
	}

	@Override
	public List<Department> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Department t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Department t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Department t) {
		// TODO Auto-generated method stub
		
	}

}
