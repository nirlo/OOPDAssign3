package factory;

import builder.DepartmentsBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import transfer.Department;

public class DepartmentsFactory extends AbstractFactory<Department> {
	protected DepartmentsFactory(){}
	/**
	 * 
	 * @param <T>
	 * @param rs
	 * @return 
	 */
	@Override
	public Department createFromResultSet(ResultSet rs) throws SQLException{
		return (Department) super.createFromResultSet(rs);
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
	public Department createFromMap(Map<String, String[]> map) throws SQLException{
		return (Department) super.createFromMap(map);
	}

	
	
}
