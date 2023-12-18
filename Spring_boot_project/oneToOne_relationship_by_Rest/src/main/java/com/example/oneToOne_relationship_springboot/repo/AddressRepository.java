package com.example.oneToOne_relationship_springboot.repo;

import com.example.oneToOne_relationship_springboot.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
