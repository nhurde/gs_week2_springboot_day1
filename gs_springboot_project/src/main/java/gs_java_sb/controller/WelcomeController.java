package gs_java_sb.controller.MainController;

import gs_java_sb.model.Course;
import gs_java_sb.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class WelcomeController
{
    @Autowired
    private CourseService courseService;

    @GetMapping("/welcome")
    public String welcome()
    {
        return homepage();
    }

    @GetMapping("/")
    public String homepage()
    {
        return "Welcome to my Springboot Course demo!";
    }

    @GetMapping("/error")
    public String error404()
    {
        return "Error, 404 page now found!";
    }


    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return this.courseService.getAllCourses();
    }

    @GetMapping("/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        int id = Integer.parseInt(courseId);
        return this.courseService.getCourseById(id);
    }


    @PostMapping("/courses")
    public Course addNewCourse(@RequestBody Course c)
    {
        return this.courseService.addCourse(c);
    }

    @PutMapping(value = "/courses")
    public Course updateCourse(@RequestBody Course c)
    {
        return this.courseService.updateCourse(c);
    }

    @DeleteMapping("/{cId}")
    public String deleteCourse(@PathVariable String cId)
    {
        return this.courseService.deleteCourseById(Integer.parseInt(cId));
    }
}
