package com.example.springboot_RestAPI_CRUD.dao;

import com.example.springboot_RestAPI_CRUD.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class StudentDauImplementation implements StudentDao{
    private EntityManager entityManager;

    @Autowired
    public StudentDauImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> typedQuery = entityManager.createQuery("from Student ", Student.class);
        return typedQuery.getResultList();
    }

    @Override
    public Student findRecord(Integer rollNo) {
        return entityManager.find(Student.class,rollNo);
    }

    @Override
    public String insertRecord( Student student) {
        entityManager.persist(student);
        return "Record inserted";
    }

    @Override
    public Student updateRecord(Student student) {
        return entityManager.merge(student);
    }

    @Override
    public String deleteRecord(Integer rollNo) {
        Student student = entityManager.find(Student.class,rollNo);
        entityManager.remove(student);
        return "Record deleted Successfully";
    }
}
