package factorybuilder;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public interface Factory {

	/**
	 * 
	 * @param rs
	 * @return
	 */
	public <T> T createFromResultSet(ResultSet rs);
	
	/**
	 * 
	 * @param rs
	 * @return
	 */
	public List<?> createListFromResultSet(ResultSet rs);
	
	/**
	 * 
	 * @param map
	 * @return
	 */
	public <T> T createFromMap(Map<String, String[]> map);
	
	
}
