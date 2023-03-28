package com.revature.project0spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project0spring.model.Employee;

@SpringBootApplication
@RestController	
public class Project0SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project0SpringApplication.class, args);
	}

	@GetMapping
	public List<Employee> hello() {
		List<Employee> employees = new ArrayList<>();

		Employee employee = new Employee(
			1,
			"email",
			"chudier1",
			"MANAGER"
		);

		employees.add(employee);

		return employees;
	}

}
