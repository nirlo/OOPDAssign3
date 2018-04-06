package dataaccess;

import java.util.List;

import builder.Builder;
import transfer.Employee;
import transfer.Salary;

public class SalaryDAO implements DAO<Salary> {
	
	private final String GET_ALL_SALARIES;
	
	private final String GET_BY_CODE_SALARY;
	
	private final String INSERT_SALARY;
	
	private final String UPDATE_SALARY;
	
	private final String DELETE_SALARY;
	
	private Builder<Salary> builder;
	
	
	
	public SalaryDAO() {
		GET_ALL_SALARIES = "";
		GET_BY_CODE_SALARY = "";
		INSERT_SALARY = "";
		UPDATE_SALARY = "";
		DELETE_SALARY = "";
	}

	@Override
	public List<Salary> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Salary getByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Salary t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Salary t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Salary t) {
		// TODO Auto-generated method stub
		
	}

}
