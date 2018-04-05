package logic;

import java.util.List;

import dataaccess.EmpoyeeDAO;
import transfer.Employee;

public class EmployeeLogic {
	/**
	 * 
	 */
	private final int EMPLOYEE_CODE_MAX_LENGTH = 45;
	/**
	 * 
	 */
	private final int EMPLOYEE_NAME_MAX_LENGTH = 45;
	/**
	 * 
	 */
	private EmpoyeeDAO courseDAO;
	
	
	/**
	 * 
	 */
	public EmployeeLogic() {
		//TODO
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Employee> getAllEmployees() {
		//TODO
		return null;
	}
	
	/**
	 * 
	 * @param ID
	 * @return
	 */
	public Employee getEmployeeByID(String ID) {
		//TODO
		return null;
	}
	
	/**
	 * 
	 * @param emp
	 */
	public void addEmployee(Employee emp) {
		//TODO
	}
	
	/**
	 * 
	 * @param emp
	 */
	private void cleanEmployee(Employee emp) {
		//TODO
	}
	
	/**
	 * 
	 * @param emp
	 */
	private void validateEmployee(Employee emp) {
		//TODO
	}
}
