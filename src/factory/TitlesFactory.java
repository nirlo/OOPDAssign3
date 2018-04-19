package factory;

import builder.TitlesBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import transfer.Title;

public class TitlesFactory extends AbstractFactory<Title>{
	protected TitlesFactory(){}

	@SuppressWarnings("unchecked")
	@Override
	public List<Title> createListFromResultSet(ResultSet rs) throws SQLException{
		List<Title> list = new ArrayList<>();
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromResultSet(rs)){
			list.add(new TitlesBuilder(m).get());
		}
		return list;
		
	}
}