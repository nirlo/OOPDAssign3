package logic;

import java.sql.Date;
import java.util.List;

interface Logic<T> {
	
	public List<T> getAll();
	
	public void add(T t);
	
	void clean(T t);
	
	void validate(T t);
	
	void validateString(String value, String fieldName, int max, boolean isNullAllowed);

	void validateDate(Date value, String fieldName, long max, long min, boolean isNullAllowed);
	
	void validateInt(int value, String fieldName, int max, int min, boolean isNullAllowed);
}
