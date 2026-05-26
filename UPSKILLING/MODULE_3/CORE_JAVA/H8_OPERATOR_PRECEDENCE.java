package UPSKILLING.MODULE_3.CORE_JAVA;

public class H8_OPERATOR_PRECEDENCE {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        int resultWithParentheses = (10 + 5) * 2;

        System.out.println("Expression 10 + 5 * 2 = " + result);
        System.out.println("Explanation: multiplication runs before addition.");
        System.out.println("Expression (10 + 5) * 2 = " + resultWithParentheses);
        System.out.println("Explanation: parentheses change the order of operations.");
    }
}
