package transfer;

public class Department {
	/**
	 * Static final values referencing columns within the database ResultSet
	 */
	public static final String COL_NAME = "dept_no";
	/**
	 * Static final values referencing columns within the database ResultSet
	 */
	public static final String COL_CODE = "dept_name";
	/**
	 *
	 */
	private String name;
	/**
	 *
	 */
	private int code;
	
	/**
	 *
	 */
	public String getName() {return name;}
	
	/**
	 *
	 */
	public int getCode() {return code;}

	/**
	 *
	 * @param map
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 *
	 */
	public void setCode(int code) {
		this.code = code;
	}
	/**
	 * Auto-generated hasCode method
	 * @return {@link int}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
