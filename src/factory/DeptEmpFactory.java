package factory;

import builder.DeptEmpBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import transfer.DeptEmployee;

public class DeptEmpFactory extends AbstractFactory<DeptEmployee> {
	protected DeptEmpFactory(){}
	@SuppressWarnings("unchecked")
	@Override
	public List<DeptEmployee> createListFromResultSet(ResultSet rs) throws SQLException{
		List<DeptEmployee> list = new ArrayList<>();
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromResultSet(rs)){
			list.add(new DeptEmpBuilder(m).get());
		}
		return list;
		
	}
}