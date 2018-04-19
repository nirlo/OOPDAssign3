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
	 * Constructor which also sets value for transfer object
	 * @param map 
	 */
	public DepartmentsBuilder(Map<String, String> map){
		this.setName(map);
		this.setCode(map);
	}

	/**
	 * Setter methods for transfer object
	 * @param map 
	 */
	public void setName(Map<String, String> map){
		department.setName(map.get(Department.COL_NAME));
	}

	public void setCode(Map<String, String> map){
		department.setCode(Integer.valueOf(map.get(Department.COL_CODE)));
	}
	/**
	 * Getter method for transfer object
	 * return {@link Department} object
	 */
	public Department get(){
		return this.department;
	}
}