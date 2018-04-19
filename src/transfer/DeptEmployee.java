package transfer;

import java.sql.Date;

public class DeptEmployee {
	/**
	 * 
	 */
	public static final String COL_EMP_NO = "emp_no";
	/**
	 * 
	 */
	public static final String COL_DEPT_CODE = "dept_num";
	/**
	 * 
	 */
	public static final String COL_FROM_DATE = "from_date";
	/**
	 * 
	 */
	public static final String COL_TO_DATE = "to_date";
	/**
	 * 
	 */
	private int emp_no;
	/**
	 * 
	 */
	private int dept_no;
	/**
	 * 
	 */
	private Date fromDate;
	/**
	 * 
	 */
	private Date toDate;
	
	
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

	public int getEmpNo() {
		return emp_no;
	}

	public void setEmpNo(int emp_no) {
		this.emp_no = emp_no;
	}

	public int getDeptNo() {
		return dept_no;
	}
  
	public void setDeptNo(int dept_no) {
		this.dept_no = dept_no;
	}
	/**
	 * Auto-generated hasCode method
	 * @return {@link int}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dept_no;
		result = prime * result + emp_no;
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
		DeptEmployee other = (DeptEmployee) obj;
		if (dept_no != other.dept_no)
			return false;
		if (emp_no != other.emp_no)
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
