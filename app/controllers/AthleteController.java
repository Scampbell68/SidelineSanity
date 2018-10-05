package controllers;

import models.Athlete;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;


import static play.mvc.Results.ok;

public class AthleteController
{private JPAApi jpaApi;

    @Inject
    public AthleteController(JPAApi jpaApi)

    {
        this.jpaApi=jpaApi;
    }
    @Transactional(readOnly = true)
    public Result getAthlete()
    {
        String sql= "SELECT a FROM Athlete a ORDER by AthleteName";
        List<Athlete> athletes=jpaApi.em().createQuery(sql, Athlete.class).getResultList();

        return ok(views.html.athletes.render(athletes));
    }

}
