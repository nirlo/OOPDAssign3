package factory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface Factory<T> {
	/**
	 * Convert a {@link ResultSet} into a List of some type T
	 * @param rs
	 * @return
	 */
	public List<?> createListFromResultSet(ResultSet rs) throws SQLException;
}
