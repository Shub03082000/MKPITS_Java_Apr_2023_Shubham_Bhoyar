/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springproject;

import Employee.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import question.Answer;
import question.Question;
import question.Question1;
import question.QuestionCustomized;

/**
 *
 * @author shubh
 */
public class SpringProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Resource resource = new ClassPathResource("applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        Employee employee = (Employee)factory.getBean("emp");
//        employee.display();
  
//------------------ Display Employee Details ---------------------------------------------------
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
//        Employee employee = (Employee)context.getBean("emp");
//        employee.display();
       
//------------------ Display Question paper details ---------------------------------------------        
//        Question question = (Question)context.getBean("ques");
//        question.displayInfo();
        
//------------------ constructor injection with list collection -------------------------------------
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext1.xml");
//        Question question1 = (Question)context1.getBean("que");
//        question1.displayInfo();
        
//----------------- constructor injection with map collection ---------------------------------------
//        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Question1 question = (Question1)context2.getBean("ques1");
//        question.displayInfo();

//---------------- constructor injection with non-string map -----------------------------------------
        ApplicationContext context3 = new ClassPathXmlApplicationContext("applicationContext3.xml");
        QuestionCustomized questionCustomized = (QuestionCustomized)context3.getBean("q");
        questionCustomized.displayInfo();
    }   
}
