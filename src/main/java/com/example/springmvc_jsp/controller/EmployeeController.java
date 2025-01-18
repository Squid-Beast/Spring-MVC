package com.example.springmvc_jsp.controller;

import com.example.springmvc_jsp.pojo.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @GetMapping("/addEmployee")
    public String showEmployeeForm() {
        return "addEmployee";
    }


    @PostMapping("/addEmployee")
    public String submitEmployeeDetails(
            @RequestParam("name") String name,
            @RequestParam("role") String role,
            @RequestParam("department") String department,
            Model model) {

        Employee employee = new Employee(name, role, department);

        model.addAttribute("employee", employee);

        return "employeeConfirmation";
    }
}
