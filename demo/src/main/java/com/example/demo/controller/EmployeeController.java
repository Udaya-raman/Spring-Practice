package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
@RestController
public class EmployeeController {

    @GetMapping("employee/list")
    public List<Employee> getEmployeeList(){
        Employee e = new Employee();
        Employee e1 = new Employee();
        e.setId(1);
        e.setName("Udaya");
        e.setEmail("udayaudyaua@gamil.com");
        e.setDepartment("Developer");

        e1.setId(2);
        e1.setName("thanga");
        e1.setEmail("than@gamil.com");
        e1.setDepartment("Developer 2");
        return Arrays.asList(e,e1);
    }

    @PostMapping("employee/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employee;
    }

    @PutMapping("employee/update/{name}")
    public Employee updateEmployee(@PathVariable String name, @RequestBody Employee employee) {
        employee.setName(name);
        return employee;
    }
}
