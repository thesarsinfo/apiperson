package com.spring.gestaopessoas.dto.phone;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.spring.gestaopessoas.enums.PhoneType;

public class PhoneDTO {    
    
    private Long id;
    @Enumerated(EnumType.STRING)
    private PhoneType type;    
    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;
}
