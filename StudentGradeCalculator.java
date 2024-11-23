import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of grades
        System.out.print("Enter the number of grades: ");
        int numberOfGrades = scanner.nextInt();

        // Create an array to hold the grades
        double[] grades = new double[numberOfGrades];

        // Input each grade
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        // Calculate the average
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / numberOfGrades;

        // Determine the letter grade
        String letterGrade;
        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        // Display the average and letter grade
        System.out.printf("The average grade is: %.2f%n", average);
        System.out.println("The corresponding letter grade is: " + letterGrade);

        // Close the scanner
        scanner.close();
    }
}