package factory;

import builder.DepartmentsBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import transfer.Department;

public class DepartmentsFactory extends AbstractFactory<Department> {
	/**
	 * Protected constructor so that method can only be accessed using {@link DTOFactoryCreator}
	 */
	protected DepartmentsFactory(){}

	/**
	 * Convert a {@link ResultSet} into a List of {@link Department}
	 * @param rs ResultSet
	 * @return List\<Department\>
	 * @throws SQLException 
	 */
	@Override
	public List<Department> createListFromResultSet(ResultSet rs) throws SQLException{
		List<Department> list = new ArrayList<>();
		for (Map<String,String> m : (List<Map<String,String>>)super.createListFromResultSet(rs)){
			list.add(new DepartmentsBuilder(m).get());
		}
		return list;
	}

	
	
}
