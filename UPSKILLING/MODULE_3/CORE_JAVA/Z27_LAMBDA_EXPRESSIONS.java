package UPSKILLING.MODULE_3.CORE_JAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Z27_LAMBDA_EXPRESSIONS {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("banana");
        items.add("apple");
        items.add("orange");
        items.add("grape");

        Collections.sort(items, (a, b) -> a.compareToIgnoreCase(b));
        System.out.println("Sorted list:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}
