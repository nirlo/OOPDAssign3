package factory;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import transfer.Employee;

public class EmployeeFactory extends AbstractFactory<Employee> {

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
	public List<Employee> createListFromResultSet(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 */
	@Override
	public Employee createFromMap(Map<String, String[]> map) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 
	 */
	@Override
	public List<Employee> createListResultSet(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
