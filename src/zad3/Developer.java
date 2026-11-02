package zad3;

public class Developer extends Employee {
    private int overtimeHours;

    public Developer(String name, double salary,int overtimeHours) {
        super(name, salary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return salary + (overtimeHours*20);
    }

}
