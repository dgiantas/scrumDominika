/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;

/*
 *
 * @author user
 */
public class QuestionPossibleAnswers {
    



    private models.Question question;
    private List<models.Answer> answers;

    public QuestionPossibleAnswers() {
    }

    public QuestionPossibleAnswers(models.Question question, List<models.Answer> answers) {
        this.question = question;
        this.answers = answers;
    }
    
    

    public models.Question getQuestion() {
        return question;
    }

    public void setQuestion(models.Question question) {
        this.question = question;
    }

    public List<models.Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<models.Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "QuestionPossibleAnswers{" + "question=" + question + ", answers=" + answers + '}';
    }
    
    
}


