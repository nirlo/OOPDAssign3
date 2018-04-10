package factory;

import builder.DeptEmpBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import transfer.DeptEmployee;

public class DeptEmpFactory extends AbstractFactory<DeptEmployee> {
	
	/**
	 *
	 */
	@Override
	public  DeptEmployee createFromResultSet(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 *
	 */
	@Override
	public DeptEmployee createFromMap(Map<String, String[]> map) {
		return null;
	}
	/**
	 *
	 * @return
	 * @throws java.sql.SQLException
	 */
	@Override
	public List<DeptEmployee> createListFromResultSet(ResultSet rs) throws SQLException {
		return createListFromMap(super.resultSetToMap(rs));
	}
	@Override
	public List<DeptEmployee> createListFromMap(Map<String,String[]> map) throws SQLException{
		List<DeptEmployee> list = Collections.emptyList();
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromMap(map)){
			list.add(new DeptEmpBuilder(m).get());
		}
		return list;
		
	}
}