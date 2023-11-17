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
public class QuestionCustomized {
    private int id;
    private String name;
    private Map<Answer1,User> answers;

    public QuestionCustomized() {
    }

    public QuestionCustomized(int id, String name, Map<Answer1,User> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }
    
    public void displayInfo(){
        System.out.println("question id : " + id);
        System.out.println("question name : " + name);
        System.out.println("Answers : ");
        Set <Entry<Answer1,User>> set = answers.entrySet();
        Iterator <Entry<Answer1,User>> iterator = set.iterator();
        while(iterator.hasNext()){
            Entry <Answer1,User> entry = iterator.next();
            Answer1 ans = entry.getKey();
            User user = entry.getValue();
            System.out.println("Answer information : ");
            System.out.println(ans);
            System.out.println("posted by : ");
            System.out.println(user);
        }
    }
    
}
