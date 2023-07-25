package com.multicampus.Ex3Thymeleaf.modal;

import org.springframework.stereotype.Component;

@Component
public class StudentThym {
    private String id;
    private String name;
    private String phone;
    public StudentThym(){}

    public void Student(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
