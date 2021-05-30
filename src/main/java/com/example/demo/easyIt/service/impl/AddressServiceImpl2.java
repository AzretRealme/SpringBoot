package com.example.demo.easyIt.service.impl;

import com.example.demo.easyIt.Address;
import com.example.demo.easyIt.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl2 implements AddressService {
    @Override
    public Address getAddress() {
        return new Address("Vostok-6", 155);
    }
}
