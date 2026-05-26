package UPSKILLING.MODULE_3.CORE_JAVA;

import java.lang.reflect.Method;

public class Z39_REFLECTION_IN_JAVA {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.lang.String");
        System.out.println("Methods declared in java.lang.String:");
        for (Method method : cls.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
        Method substring = cls.getMethod("substring", int.class, int.class);
        String text = "Reflection";
        String result = (String) substring.invoke(text, 0, 5);
        System.out.println("Invoke substring: " + result);
    }
}
