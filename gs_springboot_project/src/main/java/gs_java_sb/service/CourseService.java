package gs_java_sb.service;

import gs_java_sb.model.Course;
import gs_java_sb.repository.CourseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CourseServiceInterface
{
    @Autowired
    private CourseDAO serviceDao;

    CourseService()
    {

    }

    @Override
    public List<Course> getAllCourses()
    {
        return this.serviceDao.findAll();
    }

    @Override
    public Course getCourseById(int courseId)
    {
        Optional<Course> c = this.serviceDao.findById(courseId);
        Course course = null;
        if (c.isPresent()) {
            course = c.get();
        }
        else {
            throw new RuntimeException("Course not found for ID :" + courseId);
        }
        return course;
    }

    @Override
    public Course addCourse(Course course)
    {
        return this.serviceDao.save(course);
    }

    @Override
    public Course updateCourse(Course course)
    {
        return this.serviceDao.save(course);
    }

    @Override
    public String deleteCourseById(int courseId)
    {
        this.serviceDao.deleteById( courseId);
        return "Course deleted...";
    }
}
