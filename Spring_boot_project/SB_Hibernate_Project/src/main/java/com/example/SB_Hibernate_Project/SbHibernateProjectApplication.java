package com.example.SB_Hibernate_Project;

import com.example.SB_Hibernate_Project.dao.StudenDao;
import com.example.SB_Hibernate_Project.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbHibernateProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbHibernateProjectApplication.class, args);
		System.out.println("hello");
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudenDao studenDao){
		return runner->{
			System.out.println("Command line Runner");
			createStudent(studenDao);
		};
	}

	public void createStudent(StudenDao studenDao){
		Student student = new Student("pranay","Dighori","Nagpur");
		studenDao.save(student);
	}

}
