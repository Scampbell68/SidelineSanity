package controllers;

import models.QuestionSet;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

import static play.mvc.Results.ok;

public class QuestionSetController
{
    private JPAApi jpaApi;

    @Inject
    public QuestionSetController(JPAApi jpaApi)

    {
        this.jpaApi=jpaApi;
    }
    @Transactional(readOnly = true)
    public Result getQuestionSet()
    {
        String sql= "SELECT q FROM QuestionSet q ORDER by questionSetName";
        List<QuestionSet> questionSets=jpaApi.em().createQuery(sql, QuestionSet.class).getResultList();

        return ok(views.html.questionsets.render(questionSets));
    }

}
