package builder;

import java.util.Map;
import transfer.Employee;
import java.sql.Date;

public class EmployeeBuilder implements Builder<Employee> {
	private final Employee employee = new Employee();
	
	/**
	 * Class Methods
	 */
	
	
	/**
	 * Initial constructor
	 */
	
	public EmployeeBuilder(Map<String, String> map){
		this.setEmpNo(map);
		this.setFirstName(map);
		this.setLastName(map);
		this.setBirthDate(map);
		this.setGender(map);
		this.setHireDate(map);
	}
	
	public void setEmpNo(Map<String, String> map){
		employee.setEmpNo(Integer.valueOf(map.get(Employee.COL_EMP_NO)));
	}
	
	public void setFirstName(Map<String, String> map){
		employee.setFirstName(map.get(Employee.COL_FIRST_NAME));
	}
	
	public void setLastName(Map<String, String> map){
		employee.setLastName(map.get(Employee.COL_LAST_NAME));
	}
	
	public void setBirthDate(Map<String, String> map){
		employee.setBirthDate(Date.valueOf(map.get(Employee.COL_BIRTH_DATE)));
	}
	public void setGender(Map<String, String> map){
		employee.setGender(map.get(Employee.COL_GENDER).toUpperCase());
	}
	public void setHireDate(Map<String, String> map){
		employee.setBirthDate(Date.valueOf(map.get(Employee.COL_HIRE_DATE)));
		
	}

	public Employee get(){
		return employee;
	}
}
