package com.multicampus.Ex3Thymeleaf.service;

import com.multicampus.Ex3Thymeleaf.modal.StudentThym;
import com.multicampus.Ex3Thymeleaf.respository.StudentRepositoryThym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceThym {
    @Autowired
    StudentRepositoryThym studentRepositoryThym;
    public List<StudentThym> getAllStudent(){
        return studentRepositoryThym.getAllStudent();
    }
}
