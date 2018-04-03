package controller;

import java.util.List;

import model.Course;
import model.CourseDAO;

public class CourseLogic {
	private final int COURSE_CODE_MAX_LENGTH = 45;
	private final int COURSE_NAME_MAX_LENGTH = 45;
	private CourseDAO courseDAO;
	
	public CourseLogic() {
		//TODO
	}
	
	public List<Course> getAllCourses() {
		//TODO
		return null;
	}
	
	public Course getCourseByID(String ID) {
		//TODO
		return null;
	}
	
	public void addCourse(Course course) {
		//TODO
	}
	
	private void cleanCourse(Course course) {
		//TODO
	}
	
	private void validateCourse(Course course) {
		//TODO
	}
}
