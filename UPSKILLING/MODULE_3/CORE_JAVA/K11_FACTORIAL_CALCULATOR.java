package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.Scanner;

public class K11_FACTORIAL_CALCULATOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        if (args.length > 0) {
            number = Integer.parseInt(args[0]);
        } else {
            System.out.print("Enter a non-negative integer: ");
            number = scanner.nextInt();
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(number + "! = " + factorial);
        scanner.close();
    }
}
