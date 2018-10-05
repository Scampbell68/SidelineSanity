package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team
{
    @Id
    private int teamId;
    private String teamName;
    private int birthYear;
    private String gender;
    private int clubId;

    public int getClubId()
    {
        return clubId;
    }

    public void setClubId(int clubId)
    {
        this.clubId = clubId;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
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


}

