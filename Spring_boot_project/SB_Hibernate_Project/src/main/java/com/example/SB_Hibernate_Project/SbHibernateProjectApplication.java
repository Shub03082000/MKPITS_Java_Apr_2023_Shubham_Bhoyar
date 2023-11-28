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
//			createStudent(studenDao);
//			findRecord(studenDao);
//			deleteStudentRecord(studenDao);
			updateStudentRecord(studenDao);
		};
	}

	//---------------- Insert data into database ------------------------------------------
	public void createStudent(StudenDao studenDao){
		Student student = new Student("teju","kharbi","Nagpur");
		studenDao.save(student);
	}

	//----------------- Find the particular element by primary key -----------------------
	public void findRecord(StudenDao studenDao){
		Student student = studenDao.findByRollno(2);
		System.out.println(student);
	}

	//	----------------- Delete particular record by roll number ----------------------
	public void deleteStudentRecord(StudenDao studenDao){
		studenDao.deleteRecord(2);

	}

	public void updateStudentRecord(StudenDao studenDao){
		Student student = new Student();
		student.setRoll_No(7);
		student.setStud_Name("shivam");
		student.setStud_Address("pimpla phata");
		student.setCity("Nagpur");
		studenDao.updateRecord(student);
	}

}
