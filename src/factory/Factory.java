package factory;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public interface Factory<T> {

	/**
	 * 
	 * @param rs
	 * @return
	 */
	public T createFromResultSet(ResultSet rs);
	
	/**
	 * 
	 * @param rs
	 * @return
	 */
	public List<T> createListFromResultSet(ResultSet rs);
	
	/**
	 * 
	 * @param map
	 * @return
	 */
	public T createFromMap(Map<String, String[]> map);
	
	
}
