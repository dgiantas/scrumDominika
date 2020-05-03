/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class QuestionPossibleAnswers {
      
    public static ResultSet getQuestionsWithPossibleAnswers() { //input from user
        return Database.getResults(
                "SELECT \n"
                + "text_quest, text_ans\n"
                + "FROM\n"
                + " questions,\n"
                + " answers\n"
                + "WHERE\n"
                + "questions.id = answers.question_id\n"
                + ";"); 
    }
}
