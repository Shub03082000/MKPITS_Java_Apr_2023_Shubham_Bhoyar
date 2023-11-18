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
import question.QuestionNonString;

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
        System.out.println("--------------- Setter injection with dependent object example --------------------");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee)context.getBean("emp");
        employee.display();
        
        System.out.println("--------------- Setter injection with collection example --------------------");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContextString.xml");
        Question question = (Question)context1.getBean("ques");
        question.displayInfo();
        
        System.out.println("---------- Setter Injection with Non-String Collection (having Dependent Object) Example --------");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContextNonString.xml");
        QuestionNonString questionNonString = (QuestionNonString)context2.getBean("quesnonString");
        questionNonString.displayNonStringCollection();
        
    }
    
}
