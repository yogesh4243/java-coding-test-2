class Calculator {

    // Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method 3: Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Calculator_Method_Overloading {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Calling overloaded methods
        int intResult = calc.add(5, 3);
        double doubleResult = calc.add(2.5, 3.7);
        int threeIntResult = calc.add(1, 2, 3);

        // Output
        System.out.println("Integer addition: " + intResult);
        System.out.println("Double addition: " + doubleResult);
        System.out.println("Three integers addition: " + threeIntResult);
    }
}

