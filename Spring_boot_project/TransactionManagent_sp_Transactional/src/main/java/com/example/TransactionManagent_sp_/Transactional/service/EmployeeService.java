package com.example.TransactionManagent_sp_.Transactional.service;

import com.example.TransactionManagent_sp_.Transactional.entity.Address;
import com.example.TransactionManagent_sp_.Transactional.entity.Employee;
import com.example.TransactionManagent_sp_.Transactional.repository.AddressRepository;
import com.example.TransactionManagent_sp_.Transactional.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AddressService addressService;

    @Transactional
    public Employee addEmployee(Employee employee){
        Employee employeeSavedToDb = employeeRepository.save(employee);
        Address address = new Address();
        address.setAdd_id(123l);
        address.setAddress("itwari");
        address.setEmployee(employee);
        addressService.addAddress(address);
        return employeeSavedToDb;

    }

}
