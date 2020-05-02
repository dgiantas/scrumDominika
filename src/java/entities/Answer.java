/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author user
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "answers")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "text_ans")
    private String text_ans;

    public Answer() {
    }

    ;
    
    public Answer(String text_ans) {
        this.text_ans = text_ans;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getText_ans() {
        return text_ans;
    }

    public void setText_ans(String text_ans) {
        this.text_ans = text_ans;
    }

    @Override
    public String toString() {
        return "Answers{" + "id=" + id + ", text_ans=" + text_ans + '}';
    }

}

