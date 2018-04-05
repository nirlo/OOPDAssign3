package builder;

import java.sql.ResultSet;
import java.util.Map;

import transfer.Employee;

public class TitlesBuilder {
	//Class attributes
	/**
	 * 
	 */
	private final String COL_NAME;
	/**
	 * 
	 */
	private final String COL_CODE;
	/**
	 * 
	 */
	private Employee employee = new Employee();
	
	/**
	 * Class Methods
	 */
	
	
	/**
	 * Initial constructor
	 */
	public TitlesBuilder() {
		COL_NAME = null;
		COL_CODE = null;
		//TODO
	}
	
	/**
	 * 
	 * @param rs
	 */
	public void setName(ResultSet rs) {
		//TODO
	}
	/**
	 * 
	 * @param map
	 */
	public void setName(Map<String, String[]> map) {
		//TODO
	}
	
	/**
	 * 
	 * @param rs
	 */
	public void setCode(ResultSet rs) {
		//TODO
	}
	
	/**
	 * 
	 * @param map
	 */
	public void setCode(Map<String, String[]> map) {
		//TODO
	}
	/**
	 * 
	 * @return
	 */
	public Employee get() {
		return employee;
	}
}
