package com.multicampus.Ex3.repository;

import com.multicampus.Ex3.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EmployeeRepository {

    public List<Employee> employeeList = new ArrayList<Employee>();

    public List<Employee> getAllEmpRepo(){
        return employeeList;
    }

    public String addNewEmpRepo(Employee emp) {
        employeeList.add(emp);
        return "Add new employee successfully!";
    }

    public String deldeleteEmpRepo(String id) {
        //check exist emp before delete
        for(int i= 0; i<employeeList.size();i++){
            if(id.equals(employeeList.get(i).getId())){
                employeeList.remove(i);
                return "Delete successfully!";}
        }
        return "That employee is not exist!";
    }
    public String updateEmpRepo(Employee emp){
        for(int i= 0; i<employeeList.size();i++){
            if(emp.getId().equals(employeeList.get(i).getId())){
                employeeList.get(i).setName(emp.getName());
                employeeList.get(i).setPhone(emp.getPhone());
                return "Update successfully!";}
        }
        return "That employee is not exist!";
    }

}
