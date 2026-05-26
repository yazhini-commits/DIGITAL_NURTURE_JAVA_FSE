package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.Random;
import java.util.Scanner;

public class J10_NUMBER_GUESSING_GAME {
    public static void main(String[] args) {
        int secret = new Random().nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100.");

        if (args.length > 0) {
            for (String arg : args) {
                int guess = Integer.parseInt(arg);
                System.out.println("Guess: " + guess);
                if (guess == secret) {
                    System.out.println("Correct! The secret number was " + secret);
                    scanner.close();
                    return;
                } else if (guess < secret) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }
            }
            System.out.println("Ran out of provided guesses. Secret number was " + secret);
        } else {
            while (true) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                if (guess == secret) {
                    System.out.println("Correct! The secret number was " + secret);
                    break;
                } else if (guess < secret) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }
        }
        scanner.close();
    }
}
