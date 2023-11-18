/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;
import java.util.*;
/**
 *
 * @author shubh
 */
public class Question {
    private int id;
    private String question;
    private List<String> answers;

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

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

   public void displayInfo(){
       System.out.println("id = " + id + "\n" +  "question = " + question +"\n" + "answers = " + answers);
   }
    
    
}