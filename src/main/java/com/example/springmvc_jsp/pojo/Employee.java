package com.example.springmvc_jsp.pojo;

public class Employee {
    private String name;
    private String designation;
    private String department;

    public Employee(String name, String designation, String department) {
        this.name = name;
        this.designation = designation;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
