package com.example.SB_Hibernate_Project.dao;

import com.example.SB_Hibernate_Project.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImplmentation implements StudenDao{
    private EntityManager entityManager;

    @Autowired
    public StudentDaoImplmentation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }
}
