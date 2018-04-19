package builder;

import java.sql.Date;
import java.util.Map;
import transfer.DeptEmployee;


public class DeptEmpBuilder {
	//Class attributes
	private final DeptEmployee deptEmployee = new DeptEmployee();
	
	/**
	 * Constructor for transfer object
	 * @param map 
	 */
	public DeptEmpBuilder(Map<String, String> map) {
		this.setEmpNo(map);
		this.setToDate(map);
		this.setFromDate(map);
		this.setDeptNo(map);
	}

	/**
	 * Setter methods for fields within the transfer object
	 * @param map 
	 */
	public void setEmpNo(Map<String, String> map){
		deptEmployee.setEmpNo(Integer.valueOf(map.get(DeptEmployee.COL_EMP_NO)));
	}
	
	public void setDeptNo(Map<String, String> map){
		deptEmployee.setDeptNo(Integer.valueOf(map.get(DeptEmployee.COL_DEPT_CODE)));
	}
	
	public void setToDate(Map<String, String> map)	{
		deptEmployee.setToDate(Date.valueOf(map.get(DeptEmployee.COL_TO_DATE)));
	}
	
	public void setFromDate(Map<String, String> map){
		deptEmployee.setFromDate(Date.valueOf(map.get(DeptEmployee.COL_FROM_DATE)));
	}
	/**
	 * Getter method for the transfer method
	 * @return {@link DeptEmployee} obj
	 */
	public DeptEmployee get(){
		return deptEmployee;
	}
}
