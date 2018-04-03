package controller;

import java.sql.ResultSet;
import java.util.Map;

import model.Course;

public class CourseBuilder {
	private final String COL_NAME = "name";
	private final String COL_CODE = "course_num";
	private Course course = new Course();
	
	public CourseBuilder() {
		//TODO
	}
	
	public void setName(ResultSet rs) {
		//TODO
	}
	
	public void setName(Map<String, String[]> map) {
		//TODO
	}
	
	public void setCode(ResultSet rs) {
		//TODO
	}
	
	public void setCode(Map<String, String[]> map) {
		//TODO
	}
	
	public Course get() {
		return course;
	}
}
