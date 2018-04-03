package model;

import java.util.List;

import javafx.util.Builder;

public class CourseDAOImp implements CourseDAO {
	
	private final String GET_ALL_COURSES;
	private final String GET_BY_CODE_COURSE;
	private final String INSERT_COURSE;
	private final String UPDATE_COURSES;
	private final String DELETE_COURSES;
	private Builder<Course> builder;
	
	public CourseDAOImp() {
		GET_ALL_COURSES = "";
		GET_BY_CODE_COURSE = "";
		INSERT_COURSE = "";
		UPDATE_COURSES = "";
		DELETE_COURSES = "";
	}

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Course getCourseByID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
