package gs_java_sb.model;

import javax.persistence.*;

@Entity
@Table(name="courses")

public class Course
{
    @Id
    @Column(name="c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseid;

    private String coursename;
    private String courseinstructor;
    private int courseyear;
    private int duration;

    public int getId() {
        return courseid;
    }

    public void setId(int id) {
        this.courseid = id;
    }

    public Course()
    {

    }

    public Course(int cid, String cname, String cinstructor, int cyear, int cduration)
    {
        this.courseid = cid;
        this.coursename = cname;
        this.courseinstructor = cinstructor;
        this.courseyear = cyear;
        this.duration = cduration;
    }

    public int getCourseid()
    {
        return this.courseid;
    }

    public void setCourseid(int id) {
        this.courseid = id;
    }

    public String getCourseinstructor()
    {
        return this.courseinstructor;
    }

    public void setCourseinstructor(String instructor)
    {
        this.courseinstructor = instructor;
    }

    public String getCoursename() {
        return this.coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + this.courseid +
                ", coursename='" + this.coursename + '\'' +
                ", courseinstructor='" + this.courseinstructor + '\'' +
                ", courseyear='" + this.courseyear + '\'' +
                ", duration=" + this.duration +
                " minutes}";
    }
}
