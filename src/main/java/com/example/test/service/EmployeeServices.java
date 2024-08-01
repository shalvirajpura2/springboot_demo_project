package com.example.test.service;

import java.util.List;

import com.example.test.model.*;
 
public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}