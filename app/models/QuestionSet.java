package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuestionSet
{
    @Id
    private int questionSetsId;
    private String questionSetName;
    private int courseId;



    public int getCourseId()
    {
        return courseId;
    }

    public void setCourseId(int courseId)
    {
        this.courseId = courseId;
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

    public void setQuestionSetsName(String questionSetName)
    {
        this.questionSetName = questionSetName;
    }


}
