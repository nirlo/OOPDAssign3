package factory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class AbstractFactory<T> implements Factory<T> {

	
	/**
	 * Method converts {@link ResultSet} into a List of HashMap for ease of processing
	 * @param rs ResultSet
	 * @return {@link List}
	 * @throws SQLException 
	 */
	@Override
	public List<?> createListFromResultSet(ResultSet rs) throws SQLException{
		final int columnNum = rs.getMetaData().getColumnCount();
		List<Map<String, String>> list = new ArrayList<>();
		while(rs.next()){
			Map<String, String> map = new HashMap<>();
			for (int i = 1; i<=columnNum; i++){
				map.put(rs.getMetaData().getColumnLabel(i), String.valueOf(rs.getObject(i)));
			}
			list.add(map);
		}
		return list;
	}
}
