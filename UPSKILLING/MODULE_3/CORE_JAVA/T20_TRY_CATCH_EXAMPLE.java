package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.Scanner;

public class T20_TRY_CATCH_EXAMPLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        if (args.length >= 2) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } else {
            System.out.print("Enter first integer: ");
            a = scanner.nextInt();
            System.out.print("Enter second integer: ");
            b = scanner.nextInt();
        }
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero.");
        }
        scanner.close();
    }
}
