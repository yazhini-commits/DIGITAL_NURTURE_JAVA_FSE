package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.Scanner;

public class N14_ARRAY_SUM_AVERAGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        } else {
            System.out.print("Enter number of elements: ");
            n = scanner.nextInt();
        }
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            if (args.length > i + 1) {
                values[i] = Integer.parseInt(args[i + 1]);
            } else {
                System.out.print("Enter element " + (i + 1) + ": ");
                values[i] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        double average = n > 0 ? (double) sum / n : 0;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        scanner.close();
    }
}
