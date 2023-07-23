package com.multicampus.Ex3.service;

import com.multicampus.Ex3.model.Employee;
import com.multicampus.Ex3.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmp();
    }
}
