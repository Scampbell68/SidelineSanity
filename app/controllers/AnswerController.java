package controllers;

import models.Answer;
import models.AnswerDetail;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

import static play.mvc.Results.ok;

public class AnswerController
{
    private JPAApi jpaApi;

    @Inject
    public AnswerController(JPAApi jpaApi)

    {
        this.jpaApi = jpaApi;
    }

    @Transactional(readOnly = true)
    public Result getAnswer()
    {
        String sql = "SELECT an FROM Answer an ORDER by AnswerName";
        List<Answer> answers = jpaApi.em().createQuery(sql, Answer.class).getResultList();

        return ok(views.html.answers.render(answers));
    }

    @Transactional(readOnly = true)
    public Result getAnswerDetails(int clubId)
    {
        //answerId, int questionSetsId, String answerName, int familyId, int clubId, boolean courseCompleted, LocalDate courseCertificationEndDate)

       String answersql = "SELECT NEW models.AnswerDetail(q.questionSetName,an.answerId,an.questionSetsId, an.answerName, an.familyId, f.clubId, " +
                "f.courseCompleted,f.courseCertificationEndDate) " +
                "FROM Answer an JOIN QuestionSet q ON an.questionSetsId= q.questionSetsId " +
               "JOIN Family f on an.familyId=f.familyId "+
                "WHERE f.clubId=:clubId";
                List<AnswerDetail> answerDetails = jpaApi.em().createQuery(answersql, AnswerDetail.class).setParameter("clubId", clubId).getResultList();

     /*   String playersql = "SELECT NEW models.AthleteDetail(a.athleteId, a.athleteName, a.familyId, f.courseCompleted," +
                " f.courseCertificationEndDate) " +
                "FROM Athlete a Join Family f on a.familyId=f.familyId " +
                "Where a.teamId=:teamId";
        List<AnswerDetail> answerDetails = jpaApi.em().createQuery(playersql, AnswerDetail.class).setParameter("athleteId", questionSetsId).getResultList();
*/
        return ok(views.html.answersdetails.render( answerDetails));
    }
}