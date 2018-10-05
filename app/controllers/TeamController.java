package controllers;

import models.*;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;


public class TeamController extends Controller
{
    private JPAApi jpaApi;

    @Inject
    public TeamController(JPAApi jpaApi)

    {
        this.jpaApi = jpaApi;
    }

    @Transactional(readOnly = true)
    public Result getTeam()
    {
        String sql = "SELECT t FROM Team t ORDER by teamName";
        List<Team> teams = jpaApi.em().createQuery(sql, Team.class).getResultList();

        return ok(views.html.teams.render(teams));
    }

    @Transactional(readOnly = true)
    public Result getTeamDetails(int teamId)
    {
        String sql = "SELECT NEW models.TeamDetail(t.teamId, t.teamName, c.clubId) " +
                "FROM Team t JOIN Club c ON c.clubId= t.clubId " +
                "WHERE t.teamId=:teamId";
        TeamDetail teamDetail = jpaApi.em().createQuery(sql, TeamDetail.class).setParameter("teamId", teamId).getSingleResult();

        String playersql = "SELECT NEW models.AthleteDetail(a.athleteId, a.athleteName, a.familyId, f.courseCompleted," +
                " f.courseCertificationEndDate) " +
                "FROM Athlete a Join Family f on a.familyId=f.familyId "+
                "Where a.teamId=:teamId";
       List< AthleteDetail> athleteDetails=jpaApi.em().createQuery(playersql, AthleteDetail.class).setParameter("teamId",teamId).getResultList();

            return ok(views.html.teamdetails.render(teamDetail,athleteDetails));




    }}

/*"LEFT OUTER JOIN Athlete a on a.teamId = t.teamId " +
     "LEFT OUTER JOIN Family f on f.familyId=a.familyId";
f.familyId, f.familyName, a.athleteId, a.athleteName  f.courseCompleted,f.courseCertificationEndDate,*/