package com.example.TransactionManagent_sp_.Transactional.service;

import com.example.TransactionManagent_sp_.Transactional.entity.Address;
import com.example.TransactionManagent_sp_.Transactional.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address addAddress(Address address){
        Address addressSavedToDb = addressRepository.save(address);
        return addressSavedToDb;
    }
}
