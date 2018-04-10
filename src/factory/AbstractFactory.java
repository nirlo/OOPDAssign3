package factory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class AbstractFactory<T> implements Factory<T> {
	
	/**
	 *
	 * @param rs
	 * @return
	 */
	public  List<?> createListResultSet(ResultSet rs) throws SQLException{
		return this.createListFromMap(this.resultSetToMap(rs));
	}
	@Override
	public List<?> createListFromMap(Map<String, String[]> map){
		//I must assume that the String[] is ordered so I can trasverse across String[] between different keys
		List<Map<String, String>> temp = new LinkedList<>();
		
		for(int i=0; i<map.size(); i++){
			Map<String, String> tempMap = new HashMap();
			for (String s: map.keySet()){
				tempMap.put(s, map.get(s)[i]);
			}
			temp.add(tempMap);
		}
		return temp;	
	}
	@Override
	public T createFromResultSet(ResultSet rs){
		return null;
	}
	
	@Override
	public T createFromMap(Map<String, String[]> map){
		return null;
	}
	
	private Map<String, String[]> resultSetToMap(ResultSet rs) throws SQLException{
		Map<String, String[]> map = new HashMap<>();
		for(int i=0; i<rs.getMetaData().getColumnCount();i++){
			map.put(rs.getMetaData().getColumnLabel(i),(String[])rs.getArray(i).getArray());
		}
		return map;
	}
	
	
	
	
}
