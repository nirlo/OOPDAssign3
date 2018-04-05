package dataaccess;

import java.util.List;

import javafx.util.Builder;
import transfer.Employee;

public class EmployeeDAOImp implements EmpoyeeDAO {

	/**
	 * 
	 */ final String GET_ALL_EMPLOYEES;

	/**
	* 
	*/
	private final String GET_BY_CODE_EMPLOYEE;
	/**
	 * 
	 */
	private final String INSERT_EMPLOYEE;
	/**
	 * 
	 */
	private final String UPDATE_EMPLOYEES;
	/**
	 * 
	 */
	private final String DELETE_EMPLOYEES;
	/**
	 * 
	 */
	private Builder<Employee> builder;

	/**
	 * 
	 */
	public EmployeeDAOImp() {
		GET_ALL_EMPLOYEES = "";
		GET_BY_CODE_EMPLOYEE = "";
		INSERT_EMPLOYEE = "";
		UPDATE_EMPLOYEES = "";
		DELETE_EMPLOYEES = "";
	}

	/**
	 * 
	 */
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	@Override
	public Employee getEmployeeByID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
