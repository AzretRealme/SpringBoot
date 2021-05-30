package com.example.demo.easyIt.service.impl;

import com.example.demo.easyIt.Address;
import com.example.demo.easyIt.service.AddressService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public Address getAddress() {
        return new Address("Bilinka", 15);
    }
}
