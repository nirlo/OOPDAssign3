package builder;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.Map;
import transfer.DeptManager;

import transfer.Employee;

public class DeptManagerBuilder {
	//Class attributes

	private final DeptManager deptManager = new DeptManager();
	
	/**
	 * Class Methods
	 */
	
	
	/**
	 * Initial constructor
	 */
	public DeptManagerBuilder(Map<String, String> map) {
		this.setDeptNo(map);
		this.setEmpNo(map);
		this.setFromDate(map);
		this.setToDate(map);
	}

	public void setEmpNo(Map<String, String> map){
		deptManager.setEmpNo(Integer.valueOf(map.get(DeptManager.COL_EMP_NO)));
	}

	public void setDeptNo(Map<String, String> map){
		deptManager.setDeptNo(Integer.valueOf(map.get(DeptManager.COL_DEPT_NO)));
	}

	public void setFromDate(Map<String, String> map){
		deptManager.setFromDate(Date.valueOf(map.get(DeptManager.COL_FROM_DATE)));
	}

	public void setToDate(Map<String, String> map){
		deptManager.setToDate(Date.valueOf(map.get(DeptManager.COL_TO_DATE)));
		
	}
	
	public DeptManager get() {
		return deptManager;
	}
}