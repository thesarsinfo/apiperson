package com.spring.gestaopessoas.dto.person;
import java.time.LocalDate;
import java.util.List;

import com.spring.gestaopessoas.model.Phone;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor

public class PersonDTOUpdate {

    private Integer id;
    private String firstName;    
    private String lastName;    
    private String cpf;    
    private LocalDate birthDate;  
    private List<Phone> phones;
}

