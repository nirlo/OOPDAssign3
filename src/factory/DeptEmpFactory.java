package factory;

import builder.DeptEmpBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import transfer.DeptEmployee;

public class DeptEmpFactory extends AbstractFactory<DeptEmployee> {
	/**
	 * Protected constructor so that method can only be accessed using {@link DTOFactoryCreator}
	 */
	protected DeptEmpFactory(){}
	/**
	 * Converts a {@link ResultSet} into a List of {@link DeptEmployee}
	 * @param rs
	 * @return
	 * @throws SQLException 
	 */
	@Override
	public List<DeptEmployee> createListFromResultSet(ResultSet rs) throws SQLException{
		List<DeptEmployee> list = new ArrayList<>();
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromResultSet(rs)){
			list.add(new DeptEmpBuilder(m).get());
		}
		return list;
		
	}
}