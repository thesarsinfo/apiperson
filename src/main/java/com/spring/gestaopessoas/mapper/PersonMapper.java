package com.spring.gestaopessoas.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.spring.gestaopessoas.dto.person.PersonDTO;
import com.spring.gestaopessoas.dto.phone.PhoneDTO;
import com.spring.gestaopessoas.model.Person;
import com.spring.gestaopessoas.model.Phone;

@Mapper
public interface PersonMapper {
    
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    Phone toModel(PhoneDTO phoneDTO);

    
    PersonDTO toDTO(Person person);
    PhoneDTO toDTO(Phone phone);

}
