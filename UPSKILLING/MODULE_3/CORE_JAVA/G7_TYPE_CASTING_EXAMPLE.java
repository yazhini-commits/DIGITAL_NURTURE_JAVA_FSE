package UPSKILLING.MODULE_3.CORE_JAVA;

public class G7_TYPE_CASTING_EXAMPLE {
    public static void main(String[] args) {
        double originalDouble = 9.99;
        int castedInt = (int) originalDouble;
        System.out.println("Original double: " + originalDouble);
        System.out.println("Casted to int: " + castedInt);

        int originalInt = 7;
        double castedDouble = originalInt;
        System.out.println("Original int: " + originalInt);
        System.out.println("Casted to double: " + castedDouble);
    }
}
