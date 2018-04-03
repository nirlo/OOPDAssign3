package model;

public class Course {
	public final String COL_NAME = "name";
	public final String COL_CODE = "course_num";
	private String name;
	private String code;
	
	public Course() {
		//TODO
	}
	
	public Course(String name, String code) {
		//TODO
	}
	
	public int hashCode() {
		//TODO
		return 0;
	}
	
	public boolean equals(Object obj) {
		//TODO
		return false;
	}
	
	public String getName() {return name;}
	
	public String getCode() {return code;}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

}
