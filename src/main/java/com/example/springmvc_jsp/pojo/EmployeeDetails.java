package com.example.springmvc_jsp.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDetails {
    private Long id;
    private String name;
    private String designation;
    private String department;
    private String email;

    public EmployeeDetails() {
    }

    public EmployeeDetails(Long id, String name, String designation, String department, String email) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.email = email;
    }
}
