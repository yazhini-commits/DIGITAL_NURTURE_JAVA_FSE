package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.Scanner;

public class O15_STRING_REVERSAL {
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
        StringBuilder reversed = new StringBuilder(input).reverse();
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
