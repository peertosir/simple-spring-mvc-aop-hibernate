package dev.peertosir.mvc.service;


import dev.peertosir.mvc.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    void deleteEmployee(int id);
}
