package dataaccess;

import java.util.List;

import builder.Builder;
import transfer.Employee;
import transfer.Title;

public class TitleDAO implements DAO<Title> {
	
	private final String GET_ALL_TITLES;
	
	private final String GET_BY_CODE_TITLE;
	
	private final String INSERT_TITLE;
	
	private final String UPDATE_TITLE;
	
	private final String DELETE_TITLE;
	
	private Builder<Title> builder;
	
	
	
	public TitleDAO() {
		GET_ALL_TITLES = "";
		GET_BY_CODE_TITLE = "";
		INSERT_TITLE = "";
		UPDATE_TITLE = "";
		DELETE_TITLE = "";
	}

	@Override
	public List<Title> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Title getByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Title t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Title t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Title t) {
		// TODO Auto-generated method stub
		
	}

}
