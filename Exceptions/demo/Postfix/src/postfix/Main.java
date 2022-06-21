package postfix;

import java.util.Scanner;

/**
 * Evaluation of a postfix expression
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split("\\s+");
        Stack stack = new Stack(10);
        try {
            for (String word : words) {
                switch (word) {
                    case "+":
                    case "-":
                    case "*":
                    case "/": {
                        int b = stack.pop();
                        int a = stack.pop();
                        int c = evaluate(a, b, word);
                        stack.push(c);
                        break;
                    }
                    default:
                        int v = Integer.parseInt(word);
                        stack.push(v);
                }
            }
            int v = stack.pop();
            if (!stack.isEmpty()) {
                System.out.println("invalid syntax");
                return;
            }
            System.out.println(v);
        } catch (StackException e) {
            System.out.println("invalid syntax");
            e.printStackTrace();
        }
    }

    static int evaluate(int left, int right, String operation) {
        switch (operation) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
            default:
                return left / right;
        }
    }
}
