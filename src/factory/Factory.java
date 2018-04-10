package factory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface Factory<T> {

	/**
	 * 
	 * @param rs
	 * @return
	 */
	public T createFromResultSet(ResultSet rs) throws SQLException;
	
	/**
	 * 
	 * @param rs
	 * @return
	 */
	public List<?> createListFromResultSet(ResultSet rs) throws SQLException;
	
	/**
	 * 
	 * @param map
	 * @return
	 */
	public T createFromMap(Map<String, String[]> map)throws SQLException;
	/**
	 * 
	 * @param map
	 * @return 
	 */
	public List<?> createListFromMap(Map<String, String[]> map)throws SQLException;
	
}
