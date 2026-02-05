
/**
 * Write a description of class ArrayOperations here.
 *
 * @author (GROUP16)
 * @version (5/2/2026)
 */
import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Array Operations ===\n");

        // To Declare array of 5 integers
        int[] numbers = new int[5];

        // Get  the numbers from user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        //To Display all numbers
        System.out.println("\n--- Your Numbers ---");
        System.out.print("[ ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("]");

        // To Calculate  the sum of numbers
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // To Calculate  the average
        double average = (double) sum / numbers.length;

        // Find the maximum number
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        // Find the minimum number
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }

        // Display the results
        System.out.println("\n--- Statistics ---");
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        scanner.close();
    }
}