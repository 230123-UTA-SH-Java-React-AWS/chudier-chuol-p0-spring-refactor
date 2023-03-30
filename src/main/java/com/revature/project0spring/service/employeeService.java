package com.revature.project0spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.project0spring.model.Employee;
import com.revature.project0spring.repository.employeeRepository;

@Service
public class employeeService {

    private final employeeRepository eRepository;

    @Autowired
    public employeeService(employeeRepository eRepository) {
        this.eRepository = eRepository;
    }

    public List<Employee> getEmployees() {
		return eRepository.findAll();
	}
}