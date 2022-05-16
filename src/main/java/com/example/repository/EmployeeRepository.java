package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
