
/**
 * Write a description of class SimpleCalculator here.
 *
 * @author (GROUP16)
 * @version (5/2/2026)
 */
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===\n");

        //  To Get  the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // To Get the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        //  To Get  the operation
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;
        boolean validOperation = true;

        //  To Perform  the calculation using switch
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                } else {
                    System.out.println("Error:  It Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Error: Incorrect operation!");
                validOperation = false;
        }

        scanner.close();
    }
}