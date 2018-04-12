package builder;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.Map;

import transfer.Employee;
import transfer.Salary;

public class SalariesBuilder {
	//Class attributes

	private final Salary salary = new Salary();
		
	/**
	 * Initial constructor
	 */
	public SalariesBuilder(Map<String, String> map) {
		this.setSalary(map);
		this.setEmpNo(map);
		this.setFromDate(map);
		this.setToDate(map);
	}


	public void setEmpNo(Map<String, String> map){
		salary.setEmpNo(Integer.valueOf(map.get(Salary.COL_EMP_NO)));
	}

	public void setSalary(Map<String, String> map){
		salary.setSalary(Double.valueOf(map.get(Salary.COL_SALARY)));
	}

	public void setFromDate(Map<String, String> map){
		salary.setFromDate(Date.valueOf(map.get(Salary.COL_FROM_DATE)));
	}

	public void setToDate(Map<String, String> map){
		salary.setToDate(Date.valueOf(map.get(Salary.COL_TO_DATE)));
		
	}
	public Salary get() {
		return salary;
	}
}
