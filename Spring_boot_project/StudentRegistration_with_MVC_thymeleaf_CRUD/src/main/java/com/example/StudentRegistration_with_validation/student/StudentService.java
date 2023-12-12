package com.example.StudentRegistration_with_validation.student;

import com.example.StudentRegistration_with_validation.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    List<Student> displayAll();
    void saveStudent(Student student);
    Student updateRecord(Integer roll_no);
    void deleteRecord(Integer roll_no);

}
