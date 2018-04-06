package dataaccess;

import java.util.List;

public interface DAO<T> {

	public List<T> getAll();
	
	public T getByID(String id);
	
	public void add(T t);
	
	public void update(T t);
	
	public void delete(T t);
}


