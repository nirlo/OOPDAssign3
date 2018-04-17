package logic;

import java.sql.Date;
import java.util.List;

public interface Logic<T> {
	
	public List<T> getAll();
	
	public void add(T t);
	
	void clean(T t);
	
	void validate(T t);
	
	void validateString(String value, String fieldName, int max, boolean isNullAllowed);

}
