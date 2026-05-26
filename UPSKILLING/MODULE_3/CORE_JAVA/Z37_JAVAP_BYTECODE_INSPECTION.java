package UPSKILLING.MODULE_3.CORE_JAVA;

public class Z37_JAVAP_BYTECODE_INSPECTION {
    public static void main(String[] args) throws Exception {
        String className = "UPSKILLING.MODULE_3.CORE_JAVA.AK_JAVAP_BYTECODE_INSPECTION";
        Process process = new ProcessBuilder("javap", "-c", "-classpath", ".", className)
                .redirectErrorStream(true)
                .start();
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        process.waitFor();
    }
}
