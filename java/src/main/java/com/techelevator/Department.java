package com.techelevator;

public class Department {
    private int departmentId;
    private String name;

    public Department(int departmentId, String name){
        this.departmentId = departmentId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}
