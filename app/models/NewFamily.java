package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class NewFamily
{
    @Id
    private int familyId;
    private String familyName;
    private LocalDate courseCertificationEndDate;
    private String courseCompleted;
    private int clubId;
    private String email;
    private String phone;
    private String ClubName;
    private String AthleteName;
    private String TeamName;
    private int teamId;

    public int getTeamId()
    {
        return teamId;
    }

    public void setTeamId(int teamId)
    {
        this.teamId = teamId;
    }

    public NewFamily(int familyId, String familyName, LocalDate courseCertificationEndDate, String courseCompleted, int clubId, String email, String phone, String clubName, String athleteName, String teamName)
    {
        this.familyId = familyId;
        this.familyName = familyName;
        this.courseCertificationEndDate = courseCertificationEndDate;
        this.courseCompleted = courseCompleted;
        this.clubId = clubId;
        this.email = email;
        this.phone = phone;
        this.ClubName = clubName;
        this.AthleteName = athleteName;
        this.TeamName = teamName;

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

    public int getClubId()
    {
        return clubId;
    }

    public void setClubId(int clubId)
    {
        this.clubId = clubId;
    }

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

    public String getClubName()
    {
        return ClubName;
    }

    public void setClubName(String clubName)
    {
        ClubName = clubName;
    }

    public String getAthleteName()
    {
        return AthleteName;
    }

    public void setAthleteName(String athleteName)
    {
        AthleteName = athleteName;
    }

    public String getTeamName()
    {
        return TeamName;
    }

    public void setTeamName(String teamName)
    {
        TeamName = teamName;
    }
}
