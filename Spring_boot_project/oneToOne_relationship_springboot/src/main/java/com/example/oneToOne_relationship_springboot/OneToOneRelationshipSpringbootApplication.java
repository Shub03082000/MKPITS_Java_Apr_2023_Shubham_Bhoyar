package com.example.oneToOne_relationship_springboot;

import com.example.oneToOne_relationship_springboot.entity.Address;
import com.example.oneToOne_relationship_springboot.entity.Student;
import com.example.oneToOne_relationship_springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneRelationshipSpringbootApplication implements CommandLineRunner {

	private StudentService studentService;

	@Autowired
	public OneToOneRelationshipSpringbootApplication(StudentService studentService) {
		this.studentService = studentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(OneToOneRelationshipSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		save();
	}

	public void save(){
		Address address = new Address("dighori","Nagpur");
		Student student = new Student(1002,"teju",address);
		System.out.println(address);
		System.out.println(student);
		String str = studentService.save(student);
		System.out.println(str);
	}

}
