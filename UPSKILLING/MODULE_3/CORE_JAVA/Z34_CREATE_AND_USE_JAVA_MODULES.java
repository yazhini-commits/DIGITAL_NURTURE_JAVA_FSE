package UPSKILLING.MODULE_3.CORE_JAVA;

public class Z34_CREATE_AND_USE_JAVA_MODULES {
    public static void main(String[] args) {
        System.out.println("This class demonstrates the module concept in comments.");
        System.out.println("Example module-info.java content:");
        System.out.println("module com.greetings {");
        System.out.println("    requires com.utils;");
        System.out.println("}");
        System.out.println("In com.utils module you would export a utility class and call it from com.greetings.");
    }
}
