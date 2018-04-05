package dataaccess;

import java.util.List;

import transfer.Employee;

public interface EmpoyeeDAO {

	/**
	 * 
	 */
	public void addEmployee(Employee course);

	/**
	 * 
	 */
	public Employee getEmployeeByID(String ID);

	/**
	 * 
	 */
	public List<Employee> getAllEmployees();
}
