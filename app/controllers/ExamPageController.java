package controllers;

import models.*;
import play.data.FormFactory;
import play.data.DynamicForm;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class ExamPageController extends Controller
{
    private JPAApi jpaApi;
    private FormFactory formFactory;

    @Inject
    public ExamPageController(FormFactory formFactory,  JPAApi jpaApi)
    {
        this.formFactory=formFactory;
        this.jpaApi = jpaApi;
    }
/*
    @Transactional(readOnly = true)
    public Result getExamPage()
    {
        String sql = "SELECT qs FROM QuestionSet qs ORDER by questionSetsId";
        List<ExamPage> examPages = jpaApi.em().createQuery(sql, ExamPage.class).getResultList();

        return ok(views.html.exampage.render(examPages));
    }
*/

    @Transactional(readOnly = true)
    public Result getExamPage()
    { //questionSetsId, String quesstionSetName, int courseId, int answerId, int familyId, String answerName)


        String sql = "SELECT NEW models.ExamPage(qs.questionSetsId, qs.questionSetName, qs.courseId, a.answerId, a.familyId, a.answerName)" +
                "FROM QuestionSet qs JOIN Answer a ON qs.questionSetsId= a.questionSetsId";
        List<ExamPage> examPages = jpaApi.em().createQuery(sql, ExamPage.class).getResultList();

        return ok(views.html.exampage.render(examPages));
    }
    @Transactional(readOnly = true)
    public Result getExamPage2()
    { //questionSetsId, String quesstionSetName, int courseId, int answerId, int familyId, String answerName)


        String sql = "SELECT NEW models.ExamPage(qs.questionSetsId, qs.questionSetName, qs.courseId, a.answerId, a.familyId, a.answerName)" +
                "FROM QuestionSet qs JOIN Answer a ON qs.questionSetsId= a.questionSetsId";
        List<ExamPage> examPages = jpaApi.em().createQuery(sql, ExamPage.class).getResultList();

        return ok(views.html.exampage2.render(examPages));
    }
    @Transactional(readOnly = true)
    public Result getExamPage3()
    { //questionSetsId, String quesstionSetName, int courseId, int answerId, int familyId, String answerName)


        String sql = "SELECT NEW models.ExamPage(qs.questionSetsId, qs.questionSetName, qs.courseId, a.answerId, a.familyId, a.answerName)" +
                "FROM QuestionSet qs JOIN Answer a ON qs.questionSetsId= a.questionSetsId";
        List<ExamPage> examPages = jpaApi.em().createQuery(sql, ExamPage.class).getResultList();

        return ok(views.html.exampage3.render(examPages));
    }
    @Transactional(readOnly = true)
    public Result getExamPage4()
    { //questionSetsId, String quesstionSetName, int courseId, int answerId, int familyId, String answerName)


        String sql = "SELECT NEW models.ExamPage(qs.questionSetsId, qs.questionSetName, qs.courseId, a.answerId, a.familyId, a.answerName)" +
                "FROM QuestionSet qs JOIN Answer a ON qs.questionSetsId= a.questionSetsId";
        List<ExamPage> examPages = jpaApi.em().createQuery(sql, ExamPage.class).getResultList();

        return ok(views.html.exampage4.render(examPages));
    }
    @Transactional(readOnly = true)
    public Result getExamPage5()
    { //questionSetsId, String quesstionSetName, int courseId, int answerId, int familyId, String answerName)


        String sql = "SELECT NEW models.ExamPage(qs.questionSetsId, qs.questionSetName, qs.courseId, a.answerId, a.familyId, a.answerName)" +
                "FROM QuestionSet qs JOIN Answer a ON qs.questionSetsId= a.questionSetsId";
        List<ExamPage> examPages = jpaApi.em().createQuery(sql, ExamPage.class).getResultList();

        return ok(views.html.exampage5.render(examPages));
    }
    @Transactional(readOnly = true)
    public Result getExamPage6()
    { //questionSetsId, String quesstionSetName, int courseId, int answerId, int familyId, String answerName)


        String sql = "SELECT qs " +
                "FROM QuestionSet qs ";
        List<QuestionSet> examPages = jpaApi.em().createQuery(sql, QuestionSet.class).getResultList();

        return ok(views.html.exampage6.render(examPages));
    }

    @Transactional
    public Result postExamPage6()
    {
        DynamicForm form = formFactory.form().bindFromRequest();


        String answerName = form.get("1");
        String answerName2 = form.get("2");
        String answerName3 = form.get("3");
       // int questionSetsId = Integer.parseInt(form.get(""));
        //int teamId = Integer.parseInt(form.get("teamId"));
        String result = new String();

        if (answerName != null && answerName.length() >= 1)
        {
            int familyId=Integer.parseInt(session().get("familyId"));
            Answer newAnswer = new Answer();
            newAnswer.setAnswerName(answerName);

            newAnswer.setFamilyId(familyId);
            newAnswer.setQuestionSetsId(1);
            // newFamily.setTeamId(teamId);

            jpaApi.em().persist(newAnswer);
            result = "Saved";
        } else
        {
            result = "Not Saved";
        } if (answerName != null && answerName.length() >= 1)
    {
        int familyId=Integer.parseInt(session().get("familyId"));
        Answer newAnswer = new Answer();
        newAnswer.setAnswerName(answerName2);

        newAnswer.setFamilyId(familyId);
        newAnswer.setQuestionSetsId(2);
        // newFamily.setTeamId(teamId);

        jpaApi.em().persist(newAnswer);
        result = "Saved";
    } else
    {
        result = "Not Saved";
    } if (answerName != null && answerName.length() >= 1)
    {
        int familyId=Integer.parseInt(session().get("familyId"));
        Answer newAnswer = new Answer();
        newAnswer.setAnswerName(answerName3);

        newAnswer.setFamilyId(familyId);
        newAnswer.setQuestionSetsId(3);
        // newFamily.setTeamId(teamId);

        jpaApi.em().persist(newAnswer);
        result = "Saved";
    } else
    {
        result = "Not Saved";
    }
        return redirect("/family");
    }

}
