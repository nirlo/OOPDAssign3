package dataaccess;

import java.util.List;

import builder.Builder;
import transfer.Employee;

public class EmployeeDAO implements DAO<Employee> {
	
	private final String GET_ALL_EMPLOYEES;
	
	private final String GET_BY_CODE_EMPLOYEE;
	
	private final String INSERT_EMPLOYEE;
	
	private final String UPDATE_EMPLOYEE;
	
	private final String DELETE_EMPLOYEE;
	
	private Builder<Employee> builder;
	
	
	
	public EmployeeDAO() {
		GET_ALL_EMPLOYEES = "";
		GET_BY_CODE_EMPLOYEE = "";
		INSERT_EMPLOYEE = "";
		UPDATE_EMPLOYEE = "";
		DELETE_EMPLOYEE = "";
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Employee t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employee t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employee t) {
		// TODO Auto-generated method stub
		
	}

}
