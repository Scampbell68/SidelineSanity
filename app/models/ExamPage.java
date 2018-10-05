package models;

public class ExamPage
{
    private int questionSetsId;
    private String questionSetName;
    private int courseId;
    private int answerId;
    private int familyId;
    private String  answerName;

    public ExamPage(int questionSetsId, String questionSetName, int courseId, int answerId, int familyId, String answerName)
    {
        this.questionSetsId = questionSetsId;
        this.questionSetName = questionSetName;
        this.courseId = courseId;
        this.answerId = answerId;
        this.familyId = familyId;
        this.answerName = answerName;
    }

    public int getQuestionSetsId()
    {
        return questionSetsId;
    }

    public void setQuestionSetsId(int questionSetsId)
    {
        this.questionSetsId = questionSetsId;
    }

    public String getQuestionSetName()
    {
        return questionSetName;
    }

    public void setQuesstionSetName(String questionSetName)
    {
        this.questionSetName = questionSetName;
    }

    public int getCourseId()
    {
        return courseId;
    }

    public void setCourseId(int courseId)
    {
        this.courseId = courseId;
    }

    public int getAnswerId()
    {
        return answerId;
    }

    public void setAnswerId(int answerId)
    {
        this.answerId = answerId;
    }

    public int getFamilyId()
    {
        return familyId;
    }

    public void setFamilyId(int familyId)
    {
        this.familyId = familyId;
    }

    public String getAnswerName()
    {
        return answerName;
    }

    public void setAnswerName(String answerName)
    {
        this.answerName = answerName;
    }
}
