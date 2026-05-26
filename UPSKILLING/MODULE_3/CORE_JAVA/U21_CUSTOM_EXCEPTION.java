package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.Scanner;

public class U21_CUSTOM_EXCEPTION {
    static class InvalidAgeException extends Exception {
        InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        if (args.length > 0) {
            age = Integer.parseInt(args[0]);
        } else {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        try {
            validateAge(age);
            System.out.println("Age is valid: " + age);
        } catch (InvalidAgeException ex) {
            System.out.println("InvalidAgeException: " + ex.getMessage());
        }
        scanner.close();
    }
}
