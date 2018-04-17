package transfer;

import java.sql.Date;

public class DeptManager {
	/**
	 * 
	 */
	public static final String COL_EMP_NO = "emp_no";
	/**
	 * 
	 */
	public static final String COL_DEPT_NO = "dept_no";
	
	public static final String COL_FROM_DATE = "from_date";
	
	public static final String COL_TO_DATE = "to_date";

	private String empNo;
	
	private String deptNo;
	
	private Date fromDate;
	
	private Date toDate;
	
	
	/**
	 * 
	 */
	public DeptManager() {
		//TODO
	}

	/**
	 * 
	 */
	public DeptManager(String name, String code) {
		//TODO
	}

	

	

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getFromDate() {
		return fromDate.toString();
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate.toString();
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + ((deptNo == null)?0:deptNo.hashCode());
		result = prime * result + ((empNo == null)?0:empNo.hashCode());
		result = prime * result + ((fromDate == null) ? 0 : fromDate.hashCode());
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeptManager other = (DeptManager) obj;
		if (!deptNo.equals(other.deptNo))
			return false;
		if (empNo != other.empNo)
			return false;
		if (fromDate == null) {
			if (other.fromDate != null)
				return false;
		} else if (!fromDate.equals(other.fromDate))
			return false;
		if (toDate == null) {
			if (other.toDate != null)
				return false;
		} else if (!toDate.equals(other.toDate))
			return false;
		return true;
	}

	
	
}
