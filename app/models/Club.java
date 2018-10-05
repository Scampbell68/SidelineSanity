package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Club
{@Id
    private int clubId;
    private String clubName;



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
}
