package factory;

import builder.DepartmentsBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import transfer.Department;

public class DepartmentsFactory extends AbstractFactory<Department> {

	/**
	 * 
	 * @param <T>
	 * @param rs
	 * @return 
	 */
	@Override
	public <T> T createFromResultSet(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 * @throws java.sql.SQLException
	 */
	@Override
	public List<Department> createListFromResultSet(ResultSet rs) throws SQLException{
		return createListFromMap(super.resultSetToMap(rs));
	}

	@Override
	public List<Department> createListFromMap(Map<String, String[]> map) throws SQLException{
		List<Department> list = Collections.EMPTY_LIST;
		for (Map<String,String> m : (List<Map<String,String>>) super.createListFromMap(map)){
			list.add(new DepartmentsBuilder(m).get());
		}
		return list;
	}
	/**
	 * 
	 */
	@Override
	public <T> T createFromMap(Map<String, String[]> map) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
