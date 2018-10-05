package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class TeamDetail
{
    @Id
    private int teamId;
    private String teamName;
    private int clubId;
    private int familyId;
    private String familyName;
    private String courseCompleted;
    private LocalDate courseCertificationEndDate;
    private int athleteId;
    private String athleteName;

    public TeamDetail(int teamId, String teamName, int clubId)
    {
        this.teamId = teamId;
        this.teamName = teamName;
        this.clubId = clubId;
        this.familyId = familyId;
        this.familyName = familyName;
        this.courseCompleted = courseCompleted;
        this.courseCertificationEndDate = courseCertificationEndDate;
        this.athleteId = athleteId;
        this.athleteName = athleteName;
    }

    public int getTeamId()
    {
        return teamId;
    }

    public void setTeamId(int teamId)
    {
        this.teamId = teamId;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    public int getClubId()
    {
        return clubId;
    }

    public void setClubId(int clubId)
    {
        this.clubId = clubId;
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
}
