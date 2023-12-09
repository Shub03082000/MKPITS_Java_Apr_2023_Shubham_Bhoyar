package com.example.StudentRegistration_with_validation.Repository;

import com.example.StudentRegistration_with_validation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Integer> {
}
