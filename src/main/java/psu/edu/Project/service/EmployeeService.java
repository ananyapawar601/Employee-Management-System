package psu.edu.Project.service;

import psu.edu.Project.entity.Employee;
import java.util.List;

public interface EmployeeService {
    
	List<Employee> findAll();
    
	Employee getEmployeeById(Integer employeeId);
    
	Employee saveEmployee(Employee employee);
    
	void deleteEmployeeById(Integer employeeId);
	
	List<Employee> searchEmployees(String searchTerm);

}