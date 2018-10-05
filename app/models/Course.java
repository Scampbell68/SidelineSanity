package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course
{
    @Id
    private int courseId;
    private String courseName;


    public int getCourseId()
    {
        return courseId;
    }

    public void setCourseId(int courseId)
    {
        this.courseId = courseId;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
}
