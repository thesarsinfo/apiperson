package com.spring.gestaopessoas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.gestaopessoas.dto.MessageResponseDTO;
import com.spring.gestaopessoas.dto.person.PersonDTO;
import com.spring.gestaopessoas.mapper.PersonMapper;
import com.spring.gestaopessoas.model.Person;
import com.spring.gestaopessoas.repository.PersonRepository;

@Service
public class PersonService {
    private PersonRepository personRepository;

    private final PersonMapper  personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    
    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personSave = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(personSave);
        return MessageResponseDTO
        .builder()
        .message("Created person with IS " + savedPerson.getId())  
        .build();
    }
}
