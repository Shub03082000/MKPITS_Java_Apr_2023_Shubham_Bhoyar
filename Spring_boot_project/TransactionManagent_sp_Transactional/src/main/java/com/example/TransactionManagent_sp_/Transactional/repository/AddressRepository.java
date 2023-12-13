package com.example.TransactionManagent_sp_.Transactional.repository;

import com.example.TransactionManagent_sp_.Transactional.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
