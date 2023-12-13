package com.example.TransactionManagent_sp_.Transactional.repository;

import com.example.TransactionManagent_sp_.Transactional.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
