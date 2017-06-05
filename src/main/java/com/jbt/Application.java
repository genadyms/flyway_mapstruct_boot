package com.jbt;

import com.jbt.dto.PersonDTO;
import com.jbt.dto.mappers.MockMapper;
import com.jbt.dto.mappers.PersonMapper;
import com.jbt.model.*;
import org.mapstruct.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        initialize();
//        SpringApplication.run(Application.class,args);
    }

    private static void initialize() {
        Address address = new Address();
        address.setCity("Grodno");
        address.setStreet("Gorkogo");
        address.setBuilding("24/3");
        address.setFlat(100);

        Company company = new Company();
        company.setAddress(address);
        company.setName("Velcom");
        company.setType(CompanyType.TELECOMMUNUICATION);

        Person john = new Person("John", "American");
        company.addWorker(john);

        System.out.println(PersonMapper.INSTANCE.personToDto(john));
        System.out.println(PersonMapper.INSTANCE.toDtoFullname(john));

        Mock mock = new Mock(123);
        System.out.println(MockMapper.INSTANSE.mockToDto(mock));
    }
}
