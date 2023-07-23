package com.multicampus.Ex3;

import com.multicampus.Ex3.model.Employee;
import com.multicampus.Ex3.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Ex3Application implements CommandLineRunner {
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Ex3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1= new Employee(); e1.setId("001"); e1.setName("Nguyen Phuc Tue");e1.setPhone("0001");
		Employee e2= new Employee(); e2.setId("002"); e2.setName("Vuong Duy Hieu");e2.setPhone("0002");
		employeeRepository.employeeList.addAll(	Arrays.asList(e1,e2));


	}
}
