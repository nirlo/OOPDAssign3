package transfer;

import java.sql.Date;

public class DeptEmployee {
	/**
	 * 
	 */
	public final String COL_EMP_NO = "emp_no";
	/**
	 * 
	 */
	public final String COL_DEPT_CODE = "dept_num";
	/**
	 * 
	 */
	public final String COL_FROM_DATE = "from_date";
	/**
	 * 
	 */
	public final String COL_TO_DATE = "to_date";
	/**
	 * 
	 */
	private String emp_no;
	/**
	 * 
	 */
	private String dept_no;
	/**
	 * 
	 */
	private Date fromDate;
	/**
	 * 
	 */
	private Date toDate;
	
	
	/**
	 * 
	 */
	public DeptEmployee() {
		//TODO
	}

	/**
	 * 
	 */
	public DeptEmployee(String name, String code) {
		//TODO
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

	public String getEmpNo() {
		return emp_no;
	}

	public void setEmpNo(String emp_no) {
		this.emp_no = emp_no;
	}

	public String getDeptNo() {
		return dept_no;
	}

	public void setToDate(String dept_no) {
		this.dept_no = dept_no;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept_no == null)?0:dept_no.hashCode());
		result = prime * result + ((emp_no == null)?0:emp_no.hashCode());
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
