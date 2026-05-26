package UPSKILLING.MODULE_3.CORE_JAVA;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class V22_FILE_WRITING {
    public static void main(String[] args) {
        String text;
        if (args.length > 0) {
            text = String.join(" ", args);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter text to write to output.txt: ");
            text = scanner.nextLine();
            scanner.close();
        }
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(text);
            System.out.println("Written to output.txt: " + text);
        } catch (IOException ex) {
            System.out.println("Unable to write to file: " + ex.getMessage());
        }
    }
}
