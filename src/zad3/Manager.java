package zad3;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return salary*115/100;
    }



}
