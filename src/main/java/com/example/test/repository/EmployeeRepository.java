package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.example.test.model.Employee;
 
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
 
}