package gs_java_sb.service;

import gs_java_sb.model.Course;

import java.util.List;

public interface CourseServiceInterface
{
    public List<Course> getAllCourses();
    public Course getCourseById(int courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);
    public String deleteCourseById(int courseId);
}