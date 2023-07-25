package com.multicampus.Ex3Thymeleaf.respository;

import com.multicampus.Ex3.model.Employee;
import com.multicampus.Ex3Thymeleaf.modal.StudentThym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepositoryThym {
    public List<StudentThym> studentThyms = new ArrayList<StudentThym>();
    public String addNewStudent(StudentThym std) {
        studentThyms.add(std);
        return "Add new student successfully!";
    }

    public List<StudentThym> getAllStudent(){
        return studentThyms;
    }
}
