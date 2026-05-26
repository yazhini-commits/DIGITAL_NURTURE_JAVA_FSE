package UPSKILLING.MODULE_3.CORE_JAVA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class W23_FILE_READING {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Unable to read output.txt: " + ex.getMessage());
        }
    }
}
