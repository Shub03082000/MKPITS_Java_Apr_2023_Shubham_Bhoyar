package com.example.oneToOne_relationship_springboot.service;

import com.example.oneToOne_relationship_springboot.entity.Address;

import java.util.List;

public interface AddressService {
    Address findByAddressid(Integer address_id);
    List<Address> findStudentFromAddress();
    String deleteAddressFromId(Integer address_id);
}
