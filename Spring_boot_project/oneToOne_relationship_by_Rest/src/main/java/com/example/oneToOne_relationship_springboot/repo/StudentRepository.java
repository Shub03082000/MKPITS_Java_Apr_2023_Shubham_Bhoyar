package com.example.oneToOne_relationship_springboot.repo;

import com.example.oneToOne_relationship_springboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
