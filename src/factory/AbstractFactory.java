package factory;

import java.sql.ResultSet;
import java.util.List;

public abstract class AbstractFactory<T> implements Factory<T> {

	/**
	 * 
	 * @param rs
	 * @return
	 */
	public abstract List<?> createListResultSet(ResultSet rs);
	
	
}
