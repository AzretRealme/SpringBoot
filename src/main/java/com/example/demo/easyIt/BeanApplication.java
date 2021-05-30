package com.example.demo.easyIt;

import com.example.demo.easyIt.service.AddressService;
import com.example.demo.easyIt.service.impl.AddressServiceImpl;
import com.example.demo.easyIt.service.impl.AddressServiceImpl2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(AddressConfig.class);
        Address address = (Address) context.getBean("address");
        System.out.println(address);

        Address address1 = (Address) context.getBean("myAddress");
        System.out.println(address1);
        System.out.println("Hello!!!");

//                for(String name: context.getBeanDefinitionNames()){
//            System.out.println(name);
//        }

        AddressService addressService = context.getBean("addressServiceImpl2", AddressServiceImpl2.class);
        System.out.println(addressService.getAddress());

        Company addressOne = context.getBean("company", Company.class);
        System.out.println(addressOne);
        System.out.println(address.equals(address1));


//
//        AddressService addressService = context.getBean("addressServiceImpl", AddressServiceImpl.class);
//        System.out.println(addressService.getAddress());

        
//        for(String name: context.getBeanDefinitionNames()){
//            System.out.println(name);
//        }
    }
}
