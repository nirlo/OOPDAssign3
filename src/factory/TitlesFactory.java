package factory;

import builder.TitlesBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import transfer.Title;

public class TitlesFactory extends AbstractFactory<Title>{
	
	/**
	 *
	 */
	@Override
	public  Title createFromResultSet(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 *
	 */
	@Override
	public Title createFromMap(Map<String, String[]> map) {
		return null;
	}
	/**
	 *
	 * @return
	 * @throws java.sql.SQLException
	 */
	@Override
	public List<Title> createListFromResultSet(ResultSet rs) throws SQLException {
		return createListFromMap(super.resultSetToMap(rs));
	}
	@Override
	public List<Title> createListFromMap(Map<String,String[]> map) throws SQLException{
		List<Title> list = Collections.emptyList();
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromMap(map)){
			list.add(new TitlesBuilder(m).get());
		}
		return list;
		
	}
}