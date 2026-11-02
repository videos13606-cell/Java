package zad3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Ivan Ivanov", 3500.00);
        employees[1] = new Manager("Maria Petrova", 3800.50);
        employees[2] = new Developer("Georgi Georgiev", 4200.00, 4);
        employees[3] = new Developer("Elena Dimitrova", 4000.00,10 );
        employees[4] = new Developer("Dimitar Nikolov", 3900.00, 8);

        for(Employee e: employees){
            System.out.println("Name: " + e.name + "\nSalary: " + e.calculateSalary());
        }

        double highestSalary = employees[0].calculateSalary();
        String highestEmployee = employees[0].name;
        for(Employee e: employees){
            if(highestSalary<e.calculateSalary()){
                highestSalary = e.calculateSalary();
                highestEmployee = e.name;
            }
        }
        System.out.println("Highest Salary: " + highestSalary +" Employee: " + highestEmployee);
    }
}
