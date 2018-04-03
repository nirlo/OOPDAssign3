package controller;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public interface Factory {

	public <T> T createFromResultSet(ResultSet rs);
	
	public List<?> createListFromResultSet(ResultSet rs);
	
	public <T> T createFromMap(Map<String, String[]> map);
	
	
}
