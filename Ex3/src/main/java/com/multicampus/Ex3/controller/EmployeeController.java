package com.multicampus.Ex3.controller;

import com.multicampus.Ex3.model.Employee;
import com.multicampus.Ex3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/get/all")

    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

}
