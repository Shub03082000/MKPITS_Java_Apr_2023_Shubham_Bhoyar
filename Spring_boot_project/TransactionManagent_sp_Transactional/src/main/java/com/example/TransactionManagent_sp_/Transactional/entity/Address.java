package com.example.TransactionManagent_sp_.Transactional.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="add_info")
public class Address {
    @Id
    private long add_id;
    private String address;

    @OneToOne
    private Employee employee;

    public long getAdd_id() {
        return add_id;
    }

    public void setAdd_id(long add_id) {
        this.add_id = add_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
