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
	protected SalariesFactory(){}

	@Override
	public List<Salary> createListFromResultSet(ResultSet rs) throws SQLException{
		List<Salary> list = new ArrayList<>();
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromResultSet(rs)){
			list.add(new SalariesBuilder(m).get());
		}
		return list;
		
	}
}