package model;

import java.util.List;

public interface CourseDAO {
	
	public void addCourse(Course course);
	
	public Course getCourseByID(String ID);
	
	public List<Course> getAllCourses();
}
