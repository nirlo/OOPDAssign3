package factory;

import java.sql.ResultSet;
import java.util.List;
import transfer.Department;
import transfer.DeptEmployee;
import transfer.DeptManager;
import transfer.Employee;
import transfer.Salary;
import transfer.Title;

public class DTOFactoryCreator {
	/**
	 * Private constructor which should not be accessed
	 */
	private DTOFactoryCreator() { } 
	/**
	 * Getter method which returns the factory for the object
	 * @param Class<?>type of the transfer object to return the factor for that particular transfer object. If not found returns null
	 * @return
	 */
	public static Factory getFactory(Class<?> type) {
		
		if(type.equals(Department.class)){
			return new DepartmentsFactory();
		}
		else if(type.equals(DeptEmployee.class)){
			return new DeptEmpFactory();
		}
		else if(type.equals(DeptManager.class)){
			return new DeptManagerFactory();
		}
		else if(type.equals(Employee.class)){
			return new EmployeeFactory();
		}
		else if(type.equals(Salary.class)){
			return new SalariesFactory();
		}
		else if(type.equals(Title.class)){
			return new TitlesFactory();
		}
		else return null;
	}
}