package transfer;

import java.sql.Date;

public class DeptManager {
	/**
	 * 
	 */
	public final String COL_EMP_NO = "emp_no";
	/**
	 * 
	 */
	public final String COL_DEPT_NO = "dept_no";
	
	public final String COL_FROM_DATE = "from_date";
	
	public final String COL_TO_DATE = "to_date";

	private int empNo;
	
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

	

	

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptNo == null) ? 0 : deptNo.hashCode());
		result = prime * result + empNo;
		result = prime * result + ((fromDate == null) ? 0 : fromDate.hashCode());
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeptManager other = (DeptManager) obj;
		if (deptNo == null) {
			if (other.deptNo != null)
				return false;
		} else if (!deptNo.equals(other.deptNo))
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
