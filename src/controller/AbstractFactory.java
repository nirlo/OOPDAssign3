package controller;

import java.sql.ResultSet;
import java.util.List;

public abstract class AbstractFactory implements Factory {

	public abstract List<?> createListResultSet(ResultSet rs);
	
	
}
