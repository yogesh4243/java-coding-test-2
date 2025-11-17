class Employeetest2 {
    // Private attributes for encapsulation
    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to print employee details
    public void printEmployeeDetails() {
        System.out.println("Employee ID: " + id +
                " Employee Name: " + name +
                " Employee Salary: " + salary);
    }

    // Main method to test encapsulation
    public static void main(String[] args) {
        // Object of same class name
        Employeetest2 emp = new Employeetest2();

        // Setting values using setters
        emp.setId(1);
        emp.setName("John Doe");
        emp.setSalary(50000);

        // Printing details
        emp.printEmployeeDetails();
    }
}

