/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class QuestionPossibleAnswers {

        
        private static ResultSet getQuestionById(int id) {
        return Database.getResults(
                "SELECT \n"
                + "    text_quest, text_ans\n"
                + "FROM\n"
                + "    questions,\n"
                + "    answers\n"
                + "WHERE\n"
                + "    questions.id = answers.question_id\n"
                + "        AND questions.id = " + id + ";");
    }
        

       public static void getQuestionWithPossibleAnswers() {
        ResultSet rs = getQuestionById(1);
        String question="text";
        String answer;
        List<String> answers = new ArrayList();
        try {
            if(rs.next()){
                question = rs.getString(1);
                answer = rs.getString(2);
                answers.add(answer);
            }
            while (rs.next()) {
                answer = rs.getString(2);
                answers.add(answer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(question);
        System.out.println(answers);
    }
    }
