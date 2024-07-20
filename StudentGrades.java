import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store grades
        int[] grades;

        // Prompt the teacher for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Initialize the array with the size provided by the teacher
        grades = new int[numStudents];

        // Input student grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }

        // Compute average, highest, and lowest scores
        int sum = 0;
        int highest = grades[0];
        int lowest = grades[0];

        for (int grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        double average = (double) sum / numStudents;

        // Display results
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);

        input.close(); // Close the scanner
    }
}