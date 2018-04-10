package factory;

import builder.DeptManagerBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import transfer.DeptManager;

public class DeptManagerFactory extends AbstractFactory<DeptManager>{
	
	/**
	 *
	 */
	@Override
	public  DeptManager createFromResultSet(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 *
	 */
	@Override
	public DeptManager createFromMap(Map<String, String[]> map) {
		return null;
	}
	/**
	 *
	 * @return
	 * @throws java.sql.SQLException
	 */
	@Override
	public List<DeptManager> createListFromResultSet(ResultSet rs) throws SQLException {
		return createListFromMap(super.resultSetToMap(rs));
	}
	@Override
	public List<DeptManager> createListFromMap(Map<String,String[]> map) throws SQLException{
		List<DeptManager> list = Collections.emptyList();
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromMap(map)){
			list.add(new DeptManagerBuilder(m).get());
		}
		return list;
		
	}
}