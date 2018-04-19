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

	private int empNo;
	
	private int deptNo;
	
	private Date fromDate;
	
	private Date toDate;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
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
	/**
	 * Auto-generated hasCode method
	 * @return {@link int}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptNo;
		result = prime * result + empNo;
		result = prime * result + ((fromDate == null) ? 0 : fromDate.hashCode());
		result = prime * result + ((toDate == null) ? 0 : toDate.hashCode());
		return result;
	}
	/**
	 * Auto-generated equals method
	 * @param {@link Object}
	 * @return {@link boolean}
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
		if (deptNo != other.deptNo)
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
