package com.multicampus.Ex3Thymeleaf;

import com.multicampus.Ex3Thymeleaf.modal.StudentThym;
import com.multicampus.Ex3Thymeleaf.respository.StudentRepositoryThym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Ex3ApplicationThym implements CommandLineRunner {
	@Autowired
	StudentRepositoryThym studentThymRepository;

	public static void main(String[] args) {
		SpringApplication.run(Ex3ApplicationThym.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		StudentThym s1= new StudentThym(); s1.setId("001"); s1.setName("Nguyen Phuc Tue");s1.setPhone("0001");
		StudentThym s2= new StudentThym(); s2.setId("002"); s2.setName("Vuong Duy Hieu");s2.setPhone("0002");
		studentThymRepository.studentThyms.addAll(Arrays.asList(s1,s2));
	}
}
