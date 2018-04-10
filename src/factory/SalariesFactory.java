package factory;

import builder.SalariesBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import transfer.Salary;

public class SalariesFactory extends AbstractFactory<Salary> {

	/**
	 *
	 */
	@Override
	public  Salary createFromResultSet(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 *
	 */
	@Override
	public Salary createFromMap(Map<String, String[]> map) {
		return null;
	}
	/**
	 *
	 * @return
	 * @throws java.sql.SQLException
	 */
	@Override
	public List<Salary> createListFromResultSet(ResultSet rs) throws SQLException {
		return createListFromMap(super.resultSetToMap(rs));
	}
	@Override
	public List<Salary> createListFromMap(Map<String,String[]> map) throws SQLException{
		List<Salary> list = Collections.emptyList();
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromMap(map)){
			list.add(new SalariesBuilder(m).get());
		}
		return list;
		
	}
}