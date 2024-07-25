package com.example.test.service;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.model.Registration;
import com.example.test.repository.RegistrationRepository;

@Service
@Transactional
public class RegistrationService {

	@Autowired
	private RegistrationRepository repo;

	public List<Registration> listAll() {
		return repo.findAll();
	}

//	public void save(Registration Registration) {
//		repo.save(Registration);
//	}
//
	public Registration get(Integer id) {
		return repo.findById(id).get();
	}
//
//	public void delete(Integer id) {
//		repo.deleteById(id);
//	}
}
