package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClubDetail
{
    @Id private int clubId;
    private String clubName;
    private int teamId;
    private String teamName;
    private String Gender;
    private int birthYear;
    private int courseId;

    public ClubDetail(int clubId, String clubName, int teamId, String teamName, String gender, int birthYear)
    {
        this.clubId = clubId;
        this.clubName = clubName;
        this.teamId = teamId;
        this.teamName = teamName;
        Gender = gender;
        this.birthYear = birthYear;
        this.courseId = courseId;
    }

    public int getClubId()
    {
        return clubId;
    }

    public void setClubId(int clubId)
    {
        this.clubId = clubId;
    }

    public String getClubName()
    {
        return clubName;
    }

    public void setClubName(String clubName)
    {
        this.clubName = clubName;
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

    public String getGender()
    {
        return Gender;
    }

    public void setGender(String gender)
    {
        Gender = gender;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }

    public int getCourseId()
    {
        return courseId;
    }

    public void setCourseId(int courseId)
    {
        this.courseId = courseId;
    }
}
