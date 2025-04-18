package psu.edu.Project.service;

import org.springframework.stereotype.Service;
import psu.edu.Project.entity.Employee;
import psu.edu.Project.dao.EmployeeRepository;
import psu.edu.Project.service.EmployeeService;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer employeeId) {
        return employeeRepository.findById(employeeId)
               .orElseThrow(() -> new RuntimeException("Employee not found with id: " + employeeId));
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
    }
    
    @Override
    public List<Employee> searchEmployees(String searchTerm) {
        return employeeRepository.findByFirstNameContainingOrLastNameContaining(searchTerm, searchTerm);
    }
}