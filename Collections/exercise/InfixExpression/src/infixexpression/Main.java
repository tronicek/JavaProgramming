package infixexpression;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Infix expression
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] tokens = line.split("\\s+");
        Deque<Integer> operands = new ArrayDeque<>();
        Deque<String> operators = new ArrayDeque<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                case "-":
                case "*":
                case "/":
                    operators.push(token);
                    break;
                case "(":
                    break;
                case ")": {
                    int b = operands.pop();
                    int a = operands.pop();
                    String op = operators.pop();
                    int c = evaluate(op, a, b);
                    operands.push(c);
                    break;
                }
                default: {
                    Integer i = Integer.valueOf(token);
                    operands.push(i);
                }
            }
        }
        int val = operands.pop();
        if (!operands.isEmpty() || !operators.isEmpty()) {
            System.out.println("Invalid expression.");
            return;
        }
        System.out.println(val);
    }

    static int evaluate(String op, int a, int b) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new AssertionError("invalid operator: " + op);
        }
    }
}
