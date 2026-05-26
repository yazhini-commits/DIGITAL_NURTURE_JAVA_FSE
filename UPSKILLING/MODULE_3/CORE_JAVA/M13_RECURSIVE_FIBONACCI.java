package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.Scanner;

public class M13_RECURSIVE_FIBONACCI {
    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        } else {
            System.out.print("Enter a positive integer for Fibonacci: ");
            n = scanner.nextInt();
        }
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
        scanner.close();
    }
}
