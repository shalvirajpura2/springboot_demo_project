package com.example.test.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

import com.example.test.model.Registration;
import com.example.test.service.RegistrationService;

public class RegistrationController {

	@RestController
	public class ProductController {
	 
	    @Autowired
	    private RegistrationService service;
	    @GetMapping("/list")
	    public List<Registration> list() {
	        return service.listAll();
	    }
	    @GetMapping("/products/{id}")
	    public ResponseEntity<Registration> get(@PathVariable Integer id) {
	        try {
	        	Registration reg = service.get(id);
	            return new ResponseEntity<Registration>(reg, HttpStatus.OK);
	        } catch (NoSuchElementException e) {
	            return new ResponseEntity<Registration>(HttpStatus.NOT_FOUND);
	        }      
	    }
	}
	    // RESTful API methods for Retrieval operations
	     
	    // RESTful API method for Create operation
	     
	    // RESTful API method for Update operation
	     
	    // RESTful API method for Delete operation
	}