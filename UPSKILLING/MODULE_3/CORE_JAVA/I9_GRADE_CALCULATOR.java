package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.Scanner;

public class I9_GRADE_CALCULATOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks;
        if (args.length > 0) {
            marks = Integer.parseInt(args[0]);
        } else {
            System.out.print("Enter marks out of 100: ");
            marks = scanner.nextInt();
        }
        String grade;
        if (marks >= 90 && marks <= 100) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Marks: " + marks + " => Grade: " + grade);
        scanner.close();
    }
}
