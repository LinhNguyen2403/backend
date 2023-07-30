package com.multicampus.Ex3Thymeleaf.controller;

import com.multicampus.Ex3Thymeleaf.modal.StudentThym;
import com.multicampus.Ex3Thymeleaf.service.StudentServiceThym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentControllerThym {
    @Autowired
    StudentServiceThym studentServiceThym;
    @GetMapping("/")
    public String displayStd(Model model){
        model.addAttribute("StudentThym", studentServiceThym.getAllStudent());
        return "index";
    }
    @GetMapping("/insertStudent")
    public String insertStudent(Model model){
        StudentThym studentThym = new StudentThym();

        return studentServiceThym.insertStudent(model);
    }

}
