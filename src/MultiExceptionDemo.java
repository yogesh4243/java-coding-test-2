public class MultiExceptionDemo {

    public static void main(String[] args) {

        // Test cases
        String num1 = "10";
        String num2 = "0";       // Will cause ArithmeticException
        String invalidNum = "abc"; // Will cause NumberFormatException
        int[] arr = {1, 2, 3};

        // 1. ArithmeticException
        try {
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            int result = a / b;  // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }

        // 2. NumberFormatException
        try {
            int value = Integer.parseInt(invalidNum); // invalid number "abc"
            System.out.println("Value: " + value);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int x = arr[5]; // Invalid index
            System.out.println("Array value: " + x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
        }

    }
}
