package UPSKILLING.MODULE_3.CORE_JAVA;

public class Z30_SWITCH_PATTERN_MATCHING {
    public static void describeObject(Object value) {
        switch (value) {
            case Integer i -> System.out.println("Integer with value " + i);
            case String s -> System.out.println("String with value '" + s + "'");
            case Double d -> System.out.println("Double with value " + d);
            case Boolean b -> System.out.println("Boolean with value " + b);
            default -> System.out.println("Unknown type: " + value);
        }
    }

    public static void main(String[] args) {
        describeObject(42);
        describeObject("Java");
        describeObject(3.14);
        describeObject(true);
        describeObject(new Object());
    }
}
