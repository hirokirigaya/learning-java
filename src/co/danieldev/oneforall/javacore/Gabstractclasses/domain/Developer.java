package co.danieldev.oneforall.javacore.Gabstractclasses.domain;

public class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name,salary);
    }

    @Override
    public void calculateBonusSalary() {
        this.salary = this.salary + this.salary * 0.1;
    }

    @Override
    public void print() {
        System.out.println("Printing ....");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
