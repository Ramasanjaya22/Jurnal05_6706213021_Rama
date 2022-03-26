import java.util.Scanner;

public class PostfixTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression = in.next();
        System.out.println(Test.infixToPostfix(expression));
    }
}
