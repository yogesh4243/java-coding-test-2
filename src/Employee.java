class Employee {
    // Private attributes for encapsulation
    private int id;
    private String name;
    private double salary;

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
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
        Employee emp = new Employee();

        // Setting values using setters
        emp.setId(1);
        emp.setName("John Doe");
        emp.setSalary(50000);

        // Accessing details using getters or directly printing
        emp.printEmployeeDetails();
    }
}
