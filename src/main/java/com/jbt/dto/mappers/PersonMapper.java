package com.jbt.dto.mappers;

import com.jbt.dto.PersonDTO;
import com.jbt.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "lastName", target = "fullName")
    PersonDTO personToDto(Person person);

    default PersonDTO toDtoFullname(Person person) {
        PersonDTO dto = new PersonDTO();
        dto.setFullName(person.getFirstName()+" "+person.getLastName());
        return dto;
    }
}
