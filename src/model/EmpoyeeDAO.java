package model;

import java.util.List;

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
