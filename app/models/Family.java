package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Family
{
    @Id
    private int familyId;
    private String familyName;
    private LocalDate courseCertificationEndDate;
    private String courseCompleted;
    private int clubId;
    private String  email;
    private String  phone;




    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public int getClubId()
    {
        return clubId;
    }

    public void setClubId(int clubId)
    {
        this.clubId = clubId;
    }

    public LocalDate getCourseCertificationEndDate()
    {
        return courseCertificationEndDate;
    }

    public void setCourseCertificationEndDate(LocalDate courseCertificationEndDate)
    {
        this.courseCertificationEndDate = courseCertificationEndDate;
    }

    public String getCourseCompleted()
    {
        return courseCompleted;
    }

    public void setCourseCompleted(String courseCompleted)
    {
        this.courseCompleted = courseCompleted;
    }

    public int getFamilyId()
    {
        return familyId;
    }

    public void setFamilyId(int familyId)
    {
        this.familyId = familyId;
    }

    public String getFamilyName()
    {
        return familyName;
    }

    public void setFamilyName(String familyName)
    {
        this.familyName = familyName;
    }


}
