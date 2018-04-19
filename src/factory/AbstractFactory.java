package factory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractFactory<T> implements Factory<T> {

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
