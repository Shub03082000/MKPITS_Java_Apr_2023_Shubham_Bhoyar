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
public class Question1 {
    private int id;
    private String name;
    private Map<String,String> answers;

    public Question1() {
    }

    public Question1(int id, String name, Map<String, String> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }
    
    public void displayInfo(){
        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("Answers = ");
        Set <Entry<String,String>> set= answers.entrySet();
        Iterator <Entry<String,String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Entry <String,String> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
