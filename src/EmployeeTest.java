// Base class Employee
class Employee {
    String name;

    // Constructor
    Employee(String name) {
        this.name = name;
    }

    // Salary method (to be overridden)
    double calculateSalary() {
        return 0.0;
    }
}

// Manager subclass
class Manager extends Employee {
    double baseSalary;
    double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Developer subclass
class Developer extends Employee {
    double hourlyRate;
    int hoursWorked;

    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {

        // Creating Manager object
        Manager m = new Manager("John", 60000, 10000);

        // Creating Developer object
        Developer d = new Developer("Alice", 50, 160);

        // Output
        System.out.println("Manager Salary: " + m.calculateSalary());
        System.out.println("Developer Salary: " + d.calculateSalary());
    }
}
