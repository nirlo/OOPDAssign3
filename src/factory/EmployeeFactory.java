package factory;

import builder.EmployeeBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import transfer.Employee;

public class EmployeeFactory extends AbstractFactory<Employee> {
	/**
	 * Protected constructor so that method can only be accessed using {@link DTOFactoryCreator}
	 */
	protected EmployeeFactory(){}
	/**
	 * Converts a {@link ResultSet} into a List of {@link Employee}
	 * @param rs ResultSet
	 * @return List\<Employee/>
	 * @throws SQLException 
	 */
	@Override
	public List<Employee> createListFromResultSet(ResultSet rs) throws SQLException {
		List<Employee> employees = new ArrayList<>(); 
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromResultSet(rs)){
			employees.add(new EmployeeBuilder(m).get());
		}
		return employees;
		
	}

	
	
}
