package factory;

import builder.DeptManagerBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import transfer.DeptManager;

public class DeptManagerFactory extends AbstractFactory<DeptManager>{
	protected DeptManagerFactory(){}

	/**
	 *
	 */
	@Override
	public  DeptManager createFromResultSet(ResultSet rs) throws SQLException{
		return (DeptManager) super.createFromResultSet(rs);
	}
	
	/**
	 *
	 */
	@Override
	public DeptManager createFromMap(Map<String, String[]> map) throws SQLException{
		return (DeptManager) super.createFromMap(map);
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