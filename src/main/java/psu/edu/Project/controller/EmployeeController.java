package psu.edu.Project.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import psu.edu.Project.entity.Employee;
import psu.edu.Project.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(
        @RequestParam(value = "search", required = false) String searchTerm,
        Model model) {
        
        List<Employee> employees;
        if (searchTerm != null && !searchTerm.isEmpty()) {
            employees = employeeService.searchEmployees(searchTerm);
        } else {
            employees = employeeService.findAll();
        }
        model.addAttribute("employees", employees);
        return "list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-form";
    }
   
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") Integer employeeId, Model model) {
        Employee employee = employeeService.getEmployeeById(employeeId);
        model.addAttribute("employee", employee);
        return "employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees/list";
    }
    
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") Integer employeeId) {
        employeeService.deleteEmployeeById(employeeId);
        return "redirect:/employees/list";
    }
    
}