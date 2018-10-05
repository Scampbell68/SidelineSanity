package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NewAthlete
{
    @Id
    private int athleteId;
    private String  athleteName;
    private String  gender;
    private int birthYear;
    private int familyId;
    private int teamId;

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

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }

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
}
