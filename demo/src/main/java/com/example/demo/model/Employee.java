package com.example.demo.model;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String department;

     public int getId(){
         return id;
     }
     public String getName(){
         return name;
     }

     public String getEmail(){
         return email;
     }
     public String getDepartment(){
         return department;
     }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

}
