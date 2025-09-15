import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        // Menu
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        int choice = sc.nextInt();

        double result = 0;
        boolean valid = true;

        // Switch Case
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                valid = false;
                System.out.println("Invalid choice! Please choose between 1-4.");
        }

        sc.close();
    }
}
