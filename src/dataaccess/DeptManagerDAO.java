package dataaccess;

import java.util.List;

import builder.Builder;
import transfer.DeptManager;
import transfer.Employee;

public class DeptManagerDAO implements DAO<DeptManager> {
	
	private final String GET_ALL_DEPT_MANAGER;
	
	private final String GET_BY_CODE_DEPT_MANAGER;
	
	private final String INSERT_DEPT_MANAGER;
	
	private final String UPDATE_DEPT_MANAGER;
	
	private final String DELETE_DEPT_MANAGER;
	
	private Builder<DeptManager> builder;
	
	
	
	public DeptManagerDAO() {
		GET_ALL_DEPT_MANAGER = "";
		GET_BY_CODE_DEPT_MANAGER = "";
		INSERT_DEPT_MANAGER = "";
		UPDATE_DEPT_MANAGER = "";
		DELETE_DEPT_MANAGER = "";
	}

	@Override
	public List<DeptManager> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeptManager getByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(DeptManager t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(DeptManager t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DeptManager t) {
		// TODO Auto-generated method stub
		
	}

}
