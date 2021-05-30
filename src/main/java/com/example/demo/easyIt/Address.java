package com.example.demo.easyIt;

import org.springframework.beans.factory.annotation.Qualifier;

public class Address {
    private String street;
    private int number;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Address(@Qualifier("getStreet") String street, int number) {
        this.street = street;
        this.number = number;
    }

    public void init(){
        System.out.println("init");
    }
    public void destroy(){
        System.out.println("destroy");
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
