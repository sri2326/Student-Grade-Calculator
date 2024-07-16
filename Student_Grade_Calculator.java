import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numOfSub = sc.nextInt();
        int marks[] = new int[numOfSub];

        for (int i = 0; i < numOfSub; i++) {
            System.out.print("Enter the mark for subject " + (i + 1) + " (Out of 100): ");
            marks[i] = sc.nextInt();
        }

        int total_marks = 0;
        for (int mark : marks) {
            total_marks += mark;
        }

        double avgPercen = (double) total_marks / numOfSub;

        char grade;

        if (avgPercen >= 90) {
            grade = 'A';
        } else if (avgPercen >= 80) {
            grade = 'B';
        } else if (avgPercen >= 70) {
            grade = 'C';
        } else if (avgPercen >= 60) {
            grade = 'D';
        } else if (avgPercen >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + total_marks);
        System.out.printf("Average Percentage: %.2f%%\n", avgPercen);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
