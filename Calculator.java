
// Define a class called Calculator
public class Calculator {

    // Method to perform addition
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to perform subtraction
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method to perform multiplication
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to perform division
    public double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    // Main method to test the calculator
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int num1 = 10;
        int num2 = 2;

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }
}
