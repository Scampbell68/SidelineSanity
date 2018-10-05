package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Athlete
{
    @Id
    private int athleteId;
    private String athleteName;
private int birthYear;
private String Gender;
private int teamId;
private int familyId;

    public int getFamilyId()
    {
        return familyId;
    }

    public void setFamilyId(int familyId)
    {
        this.familyId = familyId;
    }

    public int getTeamId()
    {
        return teamId;
    }

    public void setTeamId(int teamId)
    {
        this.teamId = teamId;
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
        return Gender;
    }

    public void setGender(String gender)
    {
        Gender = gender;
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
