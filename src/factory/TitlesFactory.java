package factory;

import builder.TitlesBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import transfer.Title;

public class TitlesFactory extends AbstractFactory<Title>{
	/**
	 * Protected constructor so that method can only be accessed using {@link DTOFactoryCreator}
	 */
	protected TitlesFactory(){}
	/**
	 * Method used to create a List<Title>
	 * @param rs ResultSet
	 * @return List \<Title\> 
	 * @throws SQLException 
	 */
	@Override
	public List<Title> createListFromResultSet(ResultSet rs) throws SQLException{
		List<Title> list = new ArrayList<>();
		for (Map<String, String> m: (List<Map<String, String>>)super.createListFromResultSet(rs)){
			list.add(new TitlesBuilder(m).get());
		}
		return list;
		
	}
}