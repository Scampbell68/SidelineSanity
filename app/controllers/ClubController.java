package controllers;

import models.Club;
import models.ClubDetail;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class ClubController extends Controller
{
    private FormFactory formFactory;
    private JPAApi jpaApi;


    @Inject
    public ClubController(FormFactory formFactory,  JPAApi jpaApi)
    {
        this.formFactory=formFactory;
        this.jpaApi = jpaApi;
    }

    @Transactional(readOnly = true)
    public Result getClub()
    {
        DynamicForm form = formFactory.form().bindFromRequest();

        String searchName = form.get("searchname");

        if (searchName==null)
        {
            searchName="";
        }

        searchName +="%";




        String sql = "SELECT c FROM Club c ORDER BY clubName";
        List<Club> club = jpaApi.em().createQuery(sql, Club.class).getResultList();




        return ok(views.html.clubs.render(club));

        //(views.html.clubs.render(clubs));
    }

    @Transactional(readOnly = true)
    public Result getClubDetails()
    {//int clubId, String clubName, int teamId, String teamName, String gender, int birthYear, int courseId

        String sql = "SELECT NEW models.ClubDetail(c.clubId, c.clubName, t.teamId, t.teamName, t.gender, t.birthYear)"+
                "FROM Club c JOIN Team t ON c.clubId= t.clubId";
        List<ClubDetail> clubDetails = jpaApi.em().createQuery(sql, ClubDetail.class).getResultList();

        return ok(views.html.clubdetails.render(clubDetails));
    }
}