package dev.peertosir.mvc.controller;

import dev.peertosir.mvc.entity.Employee;
import dev.peertosir.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
public class MainController {

    private EmployeeService employeeService;

    @Autowired
    public MainController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("emps", employees);
        return "index";
    }

    @RequestMapping("/add-new-employee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("emp", employee);
        return "emp-form";
    }

    @RequestMapping("/save-employee")
    public String saveEmployee(@ModelAttribute("emp") Employee emp) {
        employeeService.saveEmployee(emp);
        return "redirect:/";
    }

    @RequestMapping("/update-employee")
    public String updateEmployee(@RequestParam("empId") int id, Model model) {
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("emp", employee);
        return "emp-form";
    }

    @RequestMapping("/delete-employee")
    public String deleteEmployee(@RequestParam("empId") int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}
