package controllers;





import models.Athlete;
import models.Club;
import models.Team;
import play.data.FormFactory;
import models.Family;
import play.data.DynamicForm;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class NewAthleteController extends Controller

{
    private JPAApi jpaApi;
    private FormFactory formFactory;

    @Inject
    public NewAthleteController(FormFactory formFactory, JPAApi jpaApi)
    {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }


    @Transactional
    public Result getNewAthlete()
    {
        String famsql = "SELECT f FROM Family f ORDER by familyName";
        List<Family> families = jpaApi.em().createQuery(famsql, Family.class).getResultList();

        String teamsql = "SELECT t FROM Team t ORDER by teamName";
        List<Team> teams = jpaApi.em().createQuery(teamsql, Team.class).getResultList();

        String clubsql = "SELECT c FROM Club c ORDER by clubName";
        List<Club> clubs = jpaApi.em().createQuery(clubsql, Club.class).getResultList();
        return ok(views.html.newathlete.render(teams));
    }


    @Transactional
    public Result postNewAthlete()
    {
        DynamicForm form = formFactory.form().bindFromRequest();


        String athleteName = form.get("athleteName");


        int familyId = Integer.parseInt(form.get("familyId"));
        String gender = form.get("gender");
        int birthYear = Integer.parseInt(form.get("birthYear"));

        int teamId = Integer.parseInt(form.get("teamId"));
        String result = new String();

        if (athleteName != null && athleteName.length() >= 1)
        {
            Athlete newAthlete = new Athlete();
            newAthlete.setAthleteName(athleteName);
            newAthlete.setGender(gender);
            newAthlete.setBirthYear(birthYear);
            newAthlete.setFamilyId(familyId);
            newAthlete.setTeamId(teamId);

            jpaApi.em().persist(newAthlete);
            result = "Saved";
        } else
        {
            result = "Not Saved";
        }
        return ok(athleteName);//return redirect("/liststudents");
    }

}
