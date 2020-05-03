/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import database.Database;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Walter
 */
public class QuestionPossibleAnswers {
    private int question_id;
    private Question question;
    private List<Answer> answers;

    public QuestionPossibleAnswers(int question_id, List<Answer> answers) {
        this.question_id = question_id;
        this.answers = answers;
    }
    
    

    public QuestionPossibleAnswers() {
    }

    public QuestionPossibleAnswers(Question question, List<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }
    
    
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "QuestionPossibleAnswers{" + "question=" + question + ", answers=" + answers + '}';
    
       
    }

    public void setId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}

 
