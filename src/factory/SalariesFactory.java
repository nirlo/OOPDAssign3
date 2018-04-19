package factory;

import builder.SalariesBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import transfer.Salary;

public class SalariesFactory extends AbstractFactory<Salary> {
	/**
	 * Protected constructor so that method can only be accessed using {@link DTOFactoryCreator}
	 */
	protected SalariesFactory(){}
	/**
	 * Method used to create a list of salary transfer objects
	 * @param rs ResultSet
	 * @return List\<Salary\>
	 * @throws SQLException 
	 */
	@Override
	public List<Salary> createListFromResultSet(ResultSet rs) throws SQLException{
		List<Salary> list = new ArrayList<>();
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromResultSet(rs)){
			list.add(new SalariesBuilder(m).get());
		}
		return list;
		
	}
}