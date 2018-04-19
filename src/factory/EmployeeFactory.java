package factory;

import builder.EmployeeBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import transfer.Employee;

public class EmployeeFactory extends AbstractFactory<Employee> {
	protected EmployeeFactory(){}
	/**
	 *
	 * @return
	 * @throws java.sql.SQLException
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> createListFromResultSet(ResultSet rs) throws SQLException {
		List<Employee> employees = new ArrayList<>(); 
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromResultSet(rs)){
			employees.add(new EmployeeBuilder(m).get());
		}
		return employees;
		
	}

	
	
}
