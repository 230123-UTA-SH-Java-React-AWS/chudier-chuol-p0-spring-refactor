package com.revature.project0spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.project0spring.model.Employee;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Integer> {
    
}