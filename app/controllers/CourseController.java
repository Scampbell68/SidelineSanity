package controllers;

import models.Course;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;
import static play.mvc.Results.ok;

public class CourseController extends Controller
{
    private JPAApi jpaApi;

    @Inject
    public CourseController(JPAApi jpaApi)

    {
        this.jpaApi=jpaApi;
    }
    @Transactional(readOnly = true)
    public Result getCourse()
    {
        String sql= "SELECT co FROM Course co ORDER by courseName";
        List<Course> courses=jpaApi.em().createQuery(sql, Course.class).getResultList();

        return ok(views.html.courses.render(courses));
    }

}