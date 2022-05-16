package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Employee;

@Service
public interface EmployeeService  {
		List<Employee> getAllEmployees();
		void saveEmployee(Employee employee);
	    Employee getEmployeeById(long id);
	    void deleteEmployeeById(long id);
}
