package dataaccess;

import java.util.List;

import builder.Builder;
import transfer.DeptEmployee;
import transfer.Employee;

public class DeptEmployeeDAO implements DAO<DeptEmployee> {
	
	private final String GET_ALL_DEPT_EMPLOYEE;
	
	private final String GET_BY_CODE_DEPT_EMPLOYEE;
	
	private final String INSERT_DEPT_EMPLOYEE;
	
	private final String UPDATE_DEPT_EMPLOYEE;
	
	private final String DELETE_DEPT_EMPLOYEE;
	
	private Builder<DeptEmployee> builder;
	
	
	
	public DeptEmployeeDAO() {
		GET_ALL_DEPT_EMPLOYEE = "";
		GET_BY_CODE_DEPT_EMPLOYEE = "";
		INSERT_DEPT_EMPLOYEE = "";
		UPDATE_DEPT_EMPLOYEE = "";
		DELETE_DEPT_EMPLOYEE = "";
	}

	@Override
	public List<DeptEmployee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeptEmployee getByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(DeptEmployee t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(DeptEmployee t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DeptEmployee t) {
		// TODO Auto-generated method stub
		
	}

}
