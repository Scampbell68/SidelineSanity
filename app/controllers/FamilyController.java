package controllers;

import models.Club;
import models.Team;
import play.api.mvc.Session;
import play.data.Form;
import play.data.FormFactory;
import models.Family;
import play.data.DynamicForm;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class FamilyController extends Controller
{
    private JPAApi jpaApi;
    private FormFactory formFactory;

    @Inject
    public FamilyController(FormFactory formFactory, JPAApi jpaApi)
    {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    @Transactional(readOnly = true)
    public Result getFamily()
    {
        String sql = "SELECT f FROM Family f ORDER by familyName";
        List<Family> families = jpaApi.em().createQuery(sql, Family.class).getResultList();

        return ok(views.html.families.render(families));
    }
    @Transactional(readOnly = true)
    public Result postFamily()
    {
        DynamicForm form = formFactory.form().bindFromRequest();
        String familyId=(form.get("familyId"));
        session().put("familyId",familyId);



        return redirect("/exampage");
    }

    @Transactional
    public Result getNewFamily()
    {
        String teamsql = "SELECT t FROM Team t ORDER by teamName";
        List<Team> teams = jpaApi.em().createQuery(teamsql, Team.class).getResultList();

        String clubsql = "SELECT c FROM Club c ORDER by clubName";
        List<Club> clubs = jpaApi.em().createQuery(clubsql, Club.class).getResultList();
        return ok(views.html.newfamily.render(teams, clubs));
    }


    @Transactional
    public Result postNewFamily()
    {
        DynamicForm form = formFactory.form().bindFromRequest();


        String familyName = form.get("familyName");
        String familyId = form.get("familyId");
        String email = form.get("email");
        String phone = form.get("phone");
        int clubId = Integer.parseInt(form.get("clubId"));
        //int teamId = Integer.parseInt(form.get("teamId"));
        String result = new String();

        if (familyName != null && familyName.length() >= 1)
        {
            Family newFamily = new Family();
            newFamily.setFamilyName(familyName);
            newFamily.setEmail(email);
            newFamily.setPhone(phone);
            newFamily.setClubId(clubId);
           // newFamily.setTeamId(teamId);

            jpaApi.em().persist(newFamily);
            result = "Saved";
        } else
        {
            result = "Not Saved";
        }
        return ok(familyName);//return redirect("/liststudents");
    }

}
  /*  @Transactional
    public Result postNewStudent()
    {
        DynamicForm form = formFactory.form().bindFromRequest();

        String lastName = form.get("lastname");
        String firstName = form.get("firstname");
        String studentAddress = form.get("studentaddress");
        String cityName = form.get("cityname");
        String stateId = form.get("stateId");
        String zipCode = form.get("zipcode");
        String phoneNumber = form.get("phonenumber");
        String beltRank = form.get("beltrank");
        int techniqueId = Integer.parseInt(form.get("techniqueId"));
        Boolean contractStatus = new Boolean (form.get("contractstatus"));
        BigDecimal rate = new BigDecimal(form.get("rate"));
        int InstructorId = Integer.parseInt(form.get("instructorId"));
        int paymentFrequencyId = Integer.parseInt(form.get("paymentfrequencyId"));
        LocalDate startDate = LocalDate.parse(form.get("startdate"));
        String result = new String();

        Student newstudent = new Student();
        newstudent.setLastName(lastName);
        newstudent.setFirstName(firstName);
        newstudent.setStudentAddress(studentAddress);
        newstudent.setCityName(cityName);
        newstudent.setStateId(stateId);
        newstudent.setZipCode(zipCode);
        newstudent.setPhoneNumber(phoneNumber);
        newstudent.setBeltRank(beltRank);
        newstudent.setTechniqueId(techniqueId);
        newstudent.setContractStatus(contractStatus);
        newstudent.setRate(rate);
        newstudent.setInstructorId(InstructorId);
        newstudent.setPaymentFrequencyId(paymentFrequencyId);
        newstudent.setStartDate(startDate);

        jpaApi.em().persist(newstudent);
        result = "saved";
        return redirect("/liststudents");
    }*/