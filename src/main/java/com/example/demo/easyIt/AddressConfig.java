package com.example.demo.easyIt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan(basePackages = "com.example.demo.easyIt")
public class AddressConfig {

    @Bean(name = {"address"})
    @Scope("singleton")
    public Address getAddress(){
        return new Address("Abdrahmanova", 106);
    }
    @Bean(name = {"myAddress"})
    public Address getAddress1(){
        return new Address("Turusbekova", 21);
    }

    @Bean
    public String getStreet(){
        return "Abdrahmanova";
    }

    @Bean(name = "address")
    public String getStreet2(){
        return "Chuy";
    }

    @Bean
    public int getNumber(){
        return 106;
    }
}
