package com.bootcoding.oops.service.staticpractice;

public class Employee {
    static String ceo;
    int eId;
    int salary;
    //   non static method
    public void show() {
        System.out.println(eId + ":" + salary + ":" + ceo);
    }

    //    static method
    public static void show(Employee employee) {
        System.out.println(employee.eId + ":" + employee.salary + ":" + ceo);
    }

    public static void main(String[] args) {
        Employee radhika = new Employee();
        Employee sanika = new Employee();
        radhika.eId = 1;
        radhika.salary = 1200;
        ceo = "sumit";
        radhika.show();
        sanika.eId = 2;
        sanika.salary = 3000;
        ceo = "sumit";
        sanika.show();
        show(radhika);
        show(sanika);



    }


}
