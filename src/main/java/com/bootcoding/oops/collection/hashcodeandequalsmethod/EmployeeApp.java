package com.bootcoding.oops.collection.hashcodeandequalsmethod;

import java.util.HashMap;
import java.util.Map;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee emp1= new Employee(1);
        Employee emp2= new Employee(1);
        // equals method
        Employee emp3=emp1;
        System.out.println(emp3.equals(emp1));

        System.out.println(emp1.equals(emp2));
        System.out.println("hashcode of emp1 "+emp1.hashCode());
        System.out.println("hashcode of emp2 "+emp2.hashCode());
        System.out.println("hashcode of emp3 "+emp3.hashCode());


        Map<Employee, String > emp = new HashMap<>();
        emp.put(emp1,"radhika");
        emp.put(emp2,"radhika");

        System.out.println();
        System.out.println(emp.size()); // guess the size
        System.out.println(emp.get(1));

    }
}
