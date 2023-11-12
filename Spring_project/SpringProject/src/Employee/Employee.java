/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author shubh
 */
public class Employee {
    private int id;
    private String name;
    private Address address;
    
    public Employee(int id, String name, Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    
    public Employee(int id){
        this.id = id;
    }
    
    public Employee(String name){
        this.name = name;
    }
    
    public void display(){
        System.out.println("id : " + id+ " " + "name : " + name);
        System.out.println(address.toString());
    }
}
