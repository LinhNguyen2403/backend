package com.multicampus.Ex3.controller;

import com.multicampus.Ex3.model.Employee;
import com.multicampus.Ex3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/get/all")
    public List<Employee> getAllEmployeeController(){
        return employeeService.getAllEmployeeService();
    }
    @PostMapping("/add")
    public String addNewEmpController(@RequestBody Employee emp){
        return employeeService.addNewEmpService(emp);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteEmpController(@PathVariable("id") String id){
        return employeeService.deldeleteEmpService(id);
    }
    @PutMapping("/update")
    public String updateEmpController(@RequestBody Employee emp){
        return employeeService.updateEmpService(emp);
    }

}
