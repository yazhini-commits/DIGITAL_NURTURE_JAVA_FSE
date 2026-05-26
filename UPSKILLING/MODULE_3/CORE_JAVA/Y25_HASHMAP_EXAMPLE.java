package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Y25_HASHMAP_EXAMPLE {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID and name pairs. Enter an empty name to stop.");
        while (true) {
            System.out.print("ID: ");
            String idText = scanner.nextLine();
            if (idText.isBlank()) {
                break;
            }
            int id = Integer.parseInt(idText);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isBlank()) {
                break;
            }
            students.put(id, name);
        }
        System.out.print("Enter ID to lookup: ");
        int lookup = Integer.parseInt(scanner.nextLine());
        System.out.println("Name: " + students.getOrDefault(lookup, "Not found"));
        scanner.close();
    }
}
