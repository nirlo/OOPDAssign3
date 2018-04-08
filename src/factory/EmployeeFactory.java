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
	public <T> T createFromResultSet(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 */
	@Override
	public List<?> createListFromResultSet(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 */
	@Override
	public <T> T createFromMap(Map<String, String[]> map) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 
	 */
	@Override
	public List<?> createListResultSet(ResultSet rs) throws SQLException {
                //At this particular point each list is an entry of individual row
               List<Employee> employees = Collections.EMPTY_LIST;
               for (Map<String, String> map: (List<Map<String, String>>)super.createFromResultSet(rs)){
                   new EmployeeBuilder(map).get();
               }
               
	}

	
	
}
