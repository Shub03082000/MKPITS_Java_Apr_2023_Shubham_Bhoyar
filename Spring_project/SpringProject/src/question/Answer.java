/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

/**
 *
 * @author shubh
 */
public class Answer {
    private int id;
    private String explain;
    private String by;
    
    public Answer(){
        
    }

    public Answer(int id, String explain, String by) {
        this.id = id;
        this.explain = explain;
        this.by = by;
    }
    
    @Override
    public String toString() {
        return "Answer{" + "id=" + id + ", explain=" + explain + ", by=" + by + '}';
    }
    
    
}
