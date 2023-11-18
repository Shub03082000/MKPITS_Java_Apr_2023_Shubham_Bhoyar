/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;
import java.util.*;
import java.util.Map.Entry;
/**
 *
 * @author shubh
 */
public class QuestionMap {
    private int id;
    private String question;
    private Map<String,String> answers;

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

    public Map<String, String> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<String, String> answers) {
        this.answers = answers;
    }
    
    public void show(){
        System.out.println("id = " + id);
        System.out.println("name = " + question);
        System.out.println("Answers = ");
        Set <Entry<String,String>> set = answers.entrySet();
        Iterator <Entry<String,String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Entry<String,String> entry = iterator.next();
            System.out.println("Answer : " + entry.getKey() + " " + "posted by : " + entry.getValue());
        }
    }
}
