package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Answer
{
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int    answerId;
private String answerName;
private int questionSetsId;
private int familyId;




    public int getFamilyId()
    {
        return familyId;
    }

    public void setFamilyId(int familyId)
    {
        this.familyId = familyId;
    }

    public int getQuestionSetsId()
    {
        return questionSetsId;
    }

    public void setQuestionSetsId(int questionSetsId)
    {
        this.questionSetsId = questionSetsId;
    }

    public int getAnswerId()
    {
        return answerId;
    }

    public void setAnswerId(int answerId)
    {
        this.answerId = answerId;
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
