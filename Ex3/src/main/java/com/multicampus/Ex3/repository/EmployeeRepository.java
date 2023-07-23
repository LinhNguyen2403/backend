package com.multicampus.Ex3.repository;

import com.multicampus.Ex3.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EmployeeRepository {

    public List<Employee> employeeList = new ArrayList<Employee>();

    public List<Employee> getAllEmp(){
        return employeeList;
    }
}
