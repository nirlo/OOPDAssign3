package builder;

import java.util.Map;
import transfer.Department;

public class DepartmentsBuilder {
	//Class attributes
	private final Department department = new Department();
	
	/**
	 * Class Methods
	 */
	
	
	/**
	 * Initial constructor
	 */
	public DepartmentsBuilder() {
	}

	public DepartmentsBuilder(Map<String, String> map){
		this.setName(map);
		this.setCode(map);
	}

	public void setName(Map<String, String> map){
		department.setName(map.get(Department.COL_NAME));
	}

	public void setCode(Map<String, String> map){
		department.setCode((map.get(Department.COL_CODE)));
	}
	/**
	 * 
	 * @return
	 */
	public Department get(){
		return this.department;
	}
}