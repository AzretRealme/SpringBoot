package com.example.demo.easyIt;

import com.example.demo.easyIt.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Company {
    @Autowired
    private Address address;

    @Autowired
    @Qualifier("addressServiceImpl2")
    private AddressService addressService;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Company() {
        System.out.println("Empty");
    }

    public Company(Address address) {
        System.out.println("One param");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "address=" + address +
                '}';
    }

}
