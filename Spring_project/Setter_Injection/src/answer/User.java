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
public class User {
    private int id;
    private String email;

    public User() {
    }

    public User(int id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + '}';
    }
    
    
}