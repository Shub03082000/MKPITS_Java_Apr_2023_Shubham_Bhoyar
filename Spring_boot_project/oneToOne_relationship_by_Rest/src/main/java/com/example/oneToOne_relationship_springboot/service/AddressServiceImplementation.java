package com.example.oneToOne_relationship_springboot.service;

import com.example.oneToOne_relationship_springboot.entity.Address;
import com.example.oneToOne_relationship_springboot.entity.Student;
import com.example.oneToOne_relationship_springboot.repo.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImplementation implements AddressService{
    private AddressRepository addressRepository;
    @Autowired
    public AddressServiceImplementation(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address findByAddressid(Integer address_id) {
        return addressRepository.findById(address_id).get();
    }

    @Override
    public List<Address> findStudentFromAddress() {
        return addressRepository.findAll();
    }

    @Override
    public String deleteAddressFromId(Integer address_id) {
        addressRepository.deleteById(address_id);
        return "Record deleted Successfully";
    }


}
