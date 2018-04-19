package factory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Factory<T> {
	/**
	 * 
	 * @param rs
	 * @return
	 */
	public List<?> createListFromResultSet(ResultSet rs) throws SQLException;
}
