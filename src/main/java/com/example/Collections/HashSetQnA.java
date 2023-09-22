package com.example.Collections;


import java.util.HashSet;

class Employee{

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class HashSetQnA {
    public static void main(String[] args) {

        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee(101, "Nasser Khan"));
        employees.add(new Employee(102,"Monit Malve"));
        employees.add(new Employee(103,"Ronit Sharma"));
        employees.add(new Employee(101, "Nasser Khan"));

        System.out.println(employees);

        System.out.println("Hashcode for heap object");
        System.out.println(new String("FB").hashCode());
        System.out.println(new String("Ea").hashCode());

        String s1 = "FB";
        String s2 = "Ea";

        System.out.println("Hashcode for SCP object");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


    }
}
