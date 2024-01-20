package co.danieldev.oneforall.javacore.Dinheritance.domain;

public class Manager extends Employee {
    private String department;

    public Manager(String name) {
        super(name);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
