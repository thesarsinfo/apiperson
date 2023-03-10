package com.spring.gestaopessoas.mapper;

import com.spring.gestaopessoas.dto.person.PersonDTO;
import com.spring.gestaopessoas.dto.phone.PhoneDTO;
import com.spring.gestaopessoas.model.Person;
import com.spring.gestaopessoas.model.Phone;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-10T09:12:40-0300",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230213-1046, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class PersonMapperImpl implements PersonMapper {

    private final DateTimeFormatter dateTimeFormatter_dd_MM_yyyy_1156787200 = DateTimeFormatter.ofPattern( "dd-MM-yyyy" );

    @Override
    public Person toModel(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Person.PersonBuilder person = Person.builder();

        if ( personDTO.getBirthDate() != null ) {
            person.birthDate( LocalDate.parse( personDTO.getBirthDate(), dateTimeFormatter_dd_MM_yyyy_1156787200 ) );
        }
        person.cpf( personDTO.getCpf() );
        person.firstName( personDTO.getFirstName() );
        person.id( personDTO.getId() );
        person.lastName( personDTO.getLastName() );
        person.phones( phoneDTOListToPhoneList( personDTO.getPhones() ) );

        return person.build();
    }

    @Override
    public Phone toModel(PhoneDTO phoneDTO) {
        if ( phoneDTO == null ) {
            return null;
        }

        Phone.PhoneBuilder phone = Phone.builder();

        return phone.build();
    }

    @Override
    public PersonDTO toDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO.PersonDTOBuilder personDTO = PersonDTO.builder();

        if ( person.getBirthDate() != null ) {
            personDTO.birthDate( DateTimeFormatter.ISO_LOCAL_DATE.format( person.getBirthDate() ) );
        }
        personDTO.cpf( person.getCpf() );
        personDTO.firstName( person.getFirstName() );
        personDTO.id( person.getId() );
        personDTO.lastName( person.getLastName() );
        personDTO.phones( phoneListToPhoneDTOList( person.getPhones() ) );

        return personDTO.build();
    }

    @Override
    public PhoneDTO toDTO(Phone phone) {
        if ( phone == null ) {
            return null;
        }

        PhoneDTO phoneDTO = new PhoneDTO();

        return phoneDTO;
    }

    protected List<Phone> phoneDTOListToPhoneList(List<PhoneDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Phone> list1 = new ArrayList<Phone>( list.size() );
        for ( PhoneDTO phoneDTO : list ) {
            list1.add( toModel( phoneDTO ) );
        }

        return list1;
    }

    protected List<PhoneDTO> phoneListToPhoneDTOList(List<Phone> list) {
        if ( list == null ) {
            return null;
        }

        List<PhoneDTO> list1 = new ArrayList<PhoneDTO>( list.size() );
        for ( Phone phone : list ) {
            list1.add( toDTO( phone ) );
        }

        return list1;
    }
}
