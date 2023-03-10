package com.spring.gestaopessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.gestaopessoas.model.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {
    
}
