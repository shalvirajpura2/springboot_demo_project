package com.example.test.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
	public List<Registration> findAll();
	
}