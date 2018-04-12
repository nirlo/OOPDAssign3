package builder;

import java.sql.Date;
import java.util.Map;
import transfer.DeptEmployee;


public class DeptEmpBuilder {
	//Class attributes
	private final DeptEmployee deptEmployee = new DeptEmployee();
	
	/**
	 * Initial constructor
	 */
	public DeptEmpBuilder(Map<String, String> map) {
		this.setEmpNo(map);
		this.setToDate(map);
		this.setFromDate(map);
		this.setDeptNo(map);
	}
	
	public void setEmpNo(Map<String, String> map){
		deptEmployee.setEmpNo(Integer.valueOf(map.get(DeptEmployee.COL_EMP_NO)));
	}
	
	public void setDeptNo(Map<String, String> map){
		deptEmployee.setDeptNo(map.get(DeptEmployee.COL_DEPT_CODE));
	}
	
	public void setToDate(Map<String, String> map)	{
		deptEmployee.setToDate(Date.valueOf(map.get(DeptEmployee.COL_TO_DATE)));
	}
	
	public void setFromDate(Map<String, String> map){
		deptEmployee.setFromDate(Date.valueOf(map.get(DeptEmployee.COL_FROM_DATE)));
	}

	public DeptEmployee get(){
		return deptEmployee;
	}
}
