package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coursetype
{
    @Id
    private int courseTypeId;
    private String courseTypeName;


    public int getCourseTypeId()
    {
        return courseTypeId;
    }

    public void setCourseTypeId(int courseTypeId)
    {
        this.courseTypeId = courseTypeId;
    }

    public String getCourseTypeName()
    {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName)
    {
        this.courseTypeName = courseTypeName;
    }
}
