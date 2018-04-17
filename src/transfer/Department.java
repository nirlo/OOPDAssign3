package transfer;

public class Department {
	/**
	 * 
	 */
	public final String COL_NAME = "dept_no";
	/**
	 * 
	 */
	public final String COL_CODE = "dept_name";
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String code;
	
	
	/**
	 * 
	 */
	public Department() {
		this("name", 0);
	}

	/**
	 * 
	 */
	public Department(String name, int code) {
		this.name = name;
		this.code = code;
	}


	/**
	 * 
	 */
	public String getName() {return name;}

	/**
	 * 
	 */
	public String getCode() {return code;}

	/**
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Department other = (Department) obj;
		if (code != other.code)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
}
