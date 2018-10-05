package models;

import javax.persistence.Id;
import java.time.LocalDate;

public class AnswerDetail
{
    @Id
    private int clubId;
    private int answerId;
    private int questionSetsId;
    private String  answerName;
    private int familyId;
    private String  questionSetName;

    private String  courseCompleted;
    private LocalDate courseCertificationEndDate;

    public String getQuestionSetName()
    {
        return questionSetName;
    }

    public void setQuestionSetName(String questionSetName)
    {
        this.questionSetName = questionSetName;
    }

    public AnswerDetail(String questionSetName,int answerId, int questionSetsId, String answerName, int familyId, int clubId, String  courseCompleted, LocalDate courseCertificationEndDate)
    {
        this.questionSetName= questionSetName;
        this.answerId = answerId;
        this.questionSetsId = questionSetsId;
        this.answerName = answerName;
        this.familyId = familyId;
        this.clubId = clubId;
        this.courseCompleted = courseCompleted;
        this.courseCertificationEndDate = courseCertificationEndDate;
    }

    public int getAnswerId()
    {
        return answerId;
    }

    public void setAnswerId(int answerId)
    {
        this.answerId = answerId;
    }

    public int getQuestionSetsId()
    {
        return questionSetsId;
    }

    public void setQuestionSetsId(int questionSetsId)
    {
        this.questionSetsId = questionSetsId;
    }

    public String getAnswerName()
    {
        return answerName;
    }

    public void setAnswerName(String answerName)
    {
        this.answerName = answerName;
    }

    public int getFamilyId()
    {
        return familyId;
    }

    public void setFamilyId(int familyId)
    {
        this.familyId = familyId;
    }

    public int getClubId()
    {
        return clubId;
    }

    public void setClubId(int clubId)
    {
        this.clubId = clubId;
    }

    public String getCourseCompleted()
    {
        return courseCompleted;
    }

    public void setCourseCompleted(String courseCompleted)
    {
        this.courseCompleted = courseCompleted;
    }

    public LocalDate getCourseCertificationEndDate()
    {
        return courseCertificationEndDate;
    }

    public void setCourseCertificationEndDate(LocalDate courseCertificationEndDate)
    {
        this.courseCertificationEndDate = courseCertificationEndDate;
    }
}
