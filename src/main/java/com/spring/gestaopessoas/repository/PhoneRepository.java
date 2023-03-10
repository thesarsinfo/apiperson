package com.spring.gestaopessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.gestaopessoas.model.Phone;

public interface PhoneRepository extends JpaRepository<Phone,Long>{
    
}
