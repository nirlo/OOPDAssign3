package logic;

import java.util.List;

interface Logic<T> {
	
	public List<T> getAll();
	
	public void add(T t);
	
	void clean(T t);
	
	void validate(T t);
	
	void validateString(String value, String fieldName, int max, boolean isNullAllowed);
}
