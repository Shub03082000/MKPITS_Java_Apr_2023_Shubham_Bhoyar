/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

import answer.Answer;
import java.util.List;

/**
 *
 * @author shubh
 */
public class QuestionNonString {
    private int id;
    private String question;
    private List<Answer> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
    
    public void displayNonStringCollection(){
        System.out.println("id = " + id + "\n" + "name = " + question + "\n" + "answers = " + answers);
    }
    
    
}
