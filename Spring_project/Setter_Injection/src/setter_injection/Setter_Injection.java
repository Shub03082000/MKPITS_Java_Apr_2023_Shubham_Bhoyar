/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setter_injection;

import employee.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import question.Question;

/**
 *
 * @author shubh
 */
public class Setter_Injection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee)context.getBean("emp");
        employee.display();
        
        ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Question question = (Question)context1.getBean("ques");
        question.displayInfo();
    }
    
}
