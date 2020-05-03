/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class QuestionPossibleAnswers {
       int id  =1;
        
        public static ResultSet getQuestionById(int id) {
        return Database.getResults("SELECT \n"+ "text_quest, text_ans\n"+ "FROM\n"+ "questions,\n"+ "answers\n" + "WHERE\n" + "questions.id = answers.question_id\n" + "AND questions.id = " + id + ";");
    }
        

       public static void getQuestionWithPossibleAnswers() {
        ResultSet rs = getQuestionById(1);
        
        String question="question1";
       
       
        List<String> answers = new ArrayList();
            for (Iterator<String> it = answers.iterator(); it.hasNext();) {
                String answer = it.next();
                System.out.println(question);
                System.out.println(answers);
            }
       }
    
