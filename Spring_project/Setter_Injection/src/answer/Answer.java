/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package answer;

/**
 *
 * @author shubh
 */
public class Answer {
    private int id;
    private String answer;
    private String postedby;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getPostedby() {
        return postedby;
    }

    public void setPostedby(String postedby) {
        this.postedby = postedby;
    }

    @Override
    public String toString() {
        return "Answer{" + "id=" + id + ", answer=" + answer + ", postedby=" + postedby + '}';
    }
    
    
}
