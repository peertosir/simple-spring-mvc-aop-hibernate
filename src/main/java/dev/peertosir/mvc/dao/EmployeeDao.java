package dev.peertosir.mvc.dao;

import dev.peertosir.mvc.entity.Employee;
import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
}
