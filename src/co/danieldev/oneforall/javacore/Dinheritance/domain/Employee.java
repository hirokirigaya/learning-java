package co.danieldev.oneforall.javacore.Dinheritance.domain;

public class Employee {
    private String name;
    private String address;
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
