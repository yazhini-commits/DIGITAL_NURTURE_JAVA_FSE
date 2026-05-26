package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class X24_ARRAYLIST_EXAMPLE {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        if (args.length > 0) {
            for (String arg : args) {
                names.add(arg);
            }
        } else {
            System.out.println("Enter student names one by one. Enter an empty line to stop.");
            while (true) {
                String name = scanner.nextLine();
                if (name.isBlank()) {
                    break;
                }
                names.add(name);
            }
            scanner.close();
        }
        System.out.println("Student names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
