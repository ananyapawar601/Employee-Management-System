package psu.edu.Project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import psu.edu.Project.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	    List<Employee> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
	}

