package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.Scanner;

public class P16_PALINDROME_CHECKER {
    public static void main(String[] args) {
        String input;
        if (args.length > 0) {
            input = String.join(" ", args);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            input = scanner.nextLine();
            scanner.close();
        }
        String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        System.out.println("Input: " + input);
        System.out.println("Palindrome? " + normalized.equals(reversed));
    }
}
