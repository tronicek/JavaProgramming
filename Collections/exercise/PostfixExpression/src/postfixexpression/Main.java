package postfixexpression;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Postfix expression
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split("\\s+");
        Deque<Integer> stack = new ArrayDeque<>();
        for (String word : words) {
            switch (word) {
                case "+": {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a + b);
                    break;
                }
                case "-": {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;
                }
                case "*": {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a * b);
                    break;
                }
                case "/": {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a / b);
                    break;
                }
                default: {
                    Integer i = Integer.valueOf(word);
                    stack.push(i);
                }
            }
        }
        int v = stack.pop();
        if (!stack.isEmpty()) {
            System.out.println("Invalid expression.");
            return;
        }
        System.out.println(v);
    }
}
