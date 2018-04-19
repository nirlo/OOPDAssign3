package factory;

import builder.DeptManagerBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import transfer.DeptManager;
import java.util.ArrayList;
public class DeptManagerFactory extends AbstractFactory<DeptManager>{
	protected DeptManagerFactory(){}
	@SuppressWarnings("unchecked")
	@Override
	public List<DeptManager> createListFromResultSet(ResultSet rs) throws SQLException{
		List<DeptManager> list = new ArrayList<>(); 
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromResultSet(rs)){
			list.add(new DeptManagerBuilder(m).get());
		}
		return list;
		
	}
}