package factory;

import builder.EmployeeBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import transfer.Employee;

public class EmployeeFactory extends AbstractFactory<Employee> {
	public static final String TAB_NAME = "employees";
	
	/**
	 *
	 */
	@Override
	public  Employee createFromResultSet(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 *
	 */
	@Override
	public Employee createFromMap(Map<String, String[]> map) {
		return null;
	}
	/**
	 *
	 * @return
	 * @throws java.sql.SQLException
	 */
	@Override
	public List<Employee> createListFromResultSet(ResultSet rs) throws SQLException {
		return createListFromMap(super.resultSetToMap(rs));
	}
	@Override
	public List<Employee> createListFromMap(Map<String,String[]> map) throws SQLException{
		List<Employee> employees = Collections.emptyList();
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromMap(map)){
			employees.add(new EmployeeBuilder(m).get());
		}
		return employees;
		
		
	}
	
	
	
}
