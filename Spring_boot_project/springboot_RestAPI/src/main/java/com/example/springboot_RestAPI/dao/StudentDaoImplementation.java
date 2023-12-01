package com.example.springboot_RestAPI.dao;

import com.example.springboot_RestAPI.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImplementation implements StudentDao{
    private EntityManager entityManager;

    @Autowired
    public StudentDaoImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> typedQuery = entityManager.createQuery("from Student", Student.class);
        return typedQuery.getResultList();
    }

    @Override
    public Student findRecord(Integer rollNo) {
        return entityManager.find(Student.class,rollNo);
    }

    @Override
    public String save(Student student) {
        entityManager.persist(student);
        return "Data inserted successfully";
    }

    @Override
    public Student updateRecord(Student student) {
        Student student1 = entityManager.merge(student);
        return student1;
    }

    @Override
    public String deleteRecord(Integer rollNo) {
       Student student= entityManager.find(Student.class,rollNo);
        entityManager.remove(student);
        return "Record deleted";
    }
}
