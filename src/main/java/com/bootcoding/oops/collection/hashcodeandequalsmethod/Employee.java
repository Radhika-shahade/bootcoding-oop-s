package com.bootcoding.oops.collection.hashcodeandequalsmethod;

public class Employee {

    int id;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee employee)) {
            return false;
        }
        return id == employee.id;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }

    public Employee(int id)
    {
        this.id=id;
    }


}
