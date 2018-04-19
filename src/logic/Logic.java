package logic;

import java.util.List;
/**
 * 
 * @author Nicholas Lockhart
 * @author Phil Lou
 *
 * @param <T>		The generic type of the logic that is implemented from this interface
 */
public interface Logic<T> {
	
	/**
	 * Retrieves all rows from a given Table in the Database
	 * 
	 * @return		List<T> 		A List of the given type to be passed through
	 */
	public List<T> getAll();
	
	/**
	 * Processes a request to add a T to the appropriate table
	 * 
	 * @param t		Object to be added to the table
	 */
	public void add(T t);
	
	/**
	 * Ensures that the data handled is clean and appropriate to Table
	 * 
	 * @param t		Object to be added
	 */
	void clean(T t);
	
	/**
	 * Ensures that the data is valid
	 * 
	 * @param t
	 */
	void validate(T t);
	
	/**
	 * Will check that a String is appropriate to the table 
	 * 
	 * @param value
	 * @param fieldName
	 * @param max
	 * @param isNullAllowed
	 */
	void validateString(String value, String fieldName, int max, boolean isNullAllowed);

}
