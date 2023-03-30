package com.revature.project0spring.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.project0spring.model.Employee;
import com.revature.project0spring.service.employeeService;


@RestController
@RequestMapping(path = "/employee")
public class employeeController {
    
	private final employeeService eService;

	@Autowired
    public employeeController(employeeService eService) {
		this.eService = eService;
	}

	@GetMapping
	public List<Employee> getEmployees() {
		return eService.getEmployees();
	}
}