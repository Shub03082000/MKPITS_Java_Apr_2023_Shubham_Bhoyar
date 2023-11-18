/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

import answer.Answer;
import answer.User;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author shubh
 */
public class QuestionNonStringMap {
    private int id;
    private String question;
    private Map<Answer,User> answers;

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

    public Map<Answer, User> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Answer, User> answers) {
        this.answers = answers;
    }
    
    public void displayNonStringMap(){
        System.out.println("id = " + id);
        System.out.println("name = " + question);
        System.out.println("Answers : ");
        Set <Entry<Answer,User>> set = answers.entrySet();
        Iterator <Entry<Answer,User>> iterator = set.iterator();
        while(iterator.hasNext()){
            Entry<Answer,User> entry = iterator.next();
            Answer ans = entry.getKey();
            User user = entry.getValue();
            System.out.println("Answer information : ");
            System.out.println(ans);
            System.out.println("posted by : ");
            System.out.println(user);
        }
    }
}
