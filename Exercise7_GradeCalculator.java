
/**
 * Write a description of class Exercise7_GradeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Exercise7_GradeCalculator
{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Grade Calculator ===\n");
        
        //Get Score from uder
        System.out.print("Enter your exam score (0-100): ");
        int score = scanner.nextInt();
        
        //Validation input
        if (score < 0 || score > 100) {
            System.out.println("Error: Score must be between 0 and 100!");
        } else {
            //Determine grade
            char grade;
            String description;

            if (score >= 90) {
                grade = 'A';
                description = "Excellent";
            } else if (score >= 80) {
                grade = 'B';
                description = "Very Good";
            } else if (score >= 70) {
                grade = 'C';
                description = "Good";
            } else if (score >= 60) {
                grade = 'D';
                description = "Satisfactory";
            } else if (score >= 50) {
                grade = 'E';
                description = "Pass";
            } else {
                grade = 'F';
                description = "Fail";
            }
            
            //Display results
            System.out.println("\n--- Results ---");
            System.out.println("Score: " + score);
            System.out.println("Grade: " + grade + " (" + description + ")");
            
            //Pass/Fail status
            if (score >= 50) {
                System.out.println("Status: PASSED! Congratulations!");
            } else {
                System.out.println("Status: FAILED. Please try again.");
            }
            scanner.close();

        }      
    }
}
    
    
    
