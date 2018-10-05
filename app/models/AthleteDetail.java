package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class AthleteDetail
{
    @Id
    int athleteId;
    private String athleteName;
    private int familyId;
    private String courseCompleted;
    private LocalDate courseCertificationEndDate;

    public AthleteDetail(int athleteId, String athleteName, int familyId, String courseCompleted, LocalDate courseCertificationEndDate)
        {
        this.athleteId = athleteId;
        this.athleteName = athleteName;
        this.familyId = familyId;
        this.courseCompleted = courseCompleted;
        this.courseCertificationEndDate = courseCertificationEndDate;
    }

    public int getAthleteId()
    {
        return athleteId;
    }

    public void setAthleteId(int athleteId)
    {
        this.athleteId = athleteId;
    }

    public String getAthleteName()
    {
        return athleteName;
    }

    public void setAthleteName(String athleteName)
    {
        this.athleteName = athleteName;
    }

    public int getFamilyId()
    {
        return familyId;
    }

    public void setFamilyId(int familyId)
    {
        this.familyId = familyId;
    }

    public String getCourseCompleted()
    {
        return courseCompleted;
    }

    public void setCourseCompleted(String courseCompleted)
    {
        this.courseCompleted = courseCompleted;
    }

    public LocalDate getCourseCertificationEndDate()
    {
        return courseCertificationEndDate;
    }

    public void setCourseCertificationEndDate(LocalDate courseCertificationEndDate)
    {
        this.courseCertificationEndDate = courseCertificationEndDate;
    }
}
