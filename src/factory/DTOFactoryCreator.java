package factory;

import transfer.Department;
import transfer.DeptEmployee;
import transfer.DeptManager;
import transfer.Employee;
import transfer.Salary;
import transfer.Title;

public class DTOFactoryCreator {

	
	private DTOFactoryCreator() { } 
	/**
	 * 
	 * @param factoryName
	 * @return
	 */
	public static Factory<?> getFactory(Class<?> type) {
		
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
	
//	/**
//	 * 
//	 * @param type
//	 * @return
//	 */
//	public static Factory createBuilder(Class<?> type) {
//		return null;
//		//TODO
//	}
//
//	public static<T> List<T> getResultSetAsList(Class<?> type, ResultSet rs){
//	}

}
