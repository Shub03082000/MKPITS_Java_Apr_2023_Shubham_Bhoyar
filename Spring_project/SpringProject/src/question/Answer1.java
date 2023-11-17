/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

import java.util.Date;

/**
 *
 * @author shubh
 */
public class Answer1 {
    private int id;
    private String answer;
    private Date postedDate;
    
    public Answer1(){
        
    }

    public Answer1(int id, String answer, Date postedDate) {
        this.id = id;
        this.answer = answer;
        this.postedDate = postedDate;
    }

    @Override
    public String toString() {
        return "Answer1{" + "id=" + id + ", answer=" + answer + ", postedDate=" + postedDate + '}';
    }
    
}
