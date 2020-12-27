package com.springboot.springboot.model;

public class SpringBootModel {

    private int id;
    private String name; 
    private float salary;

    public SpringBootModel(int i, String string, float d) {
        super();
        this.id = i;
        this.name = string;
        this.salary = d;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    
}
