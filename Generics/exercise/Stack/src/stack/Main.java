package stack;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>(10);
        nums.push(10);
        nums.push(20);
        nums.push(30);
        nums.push(40);
        while (!nums.isEmpty()) {
            Integer i = nums.pop();
            System.out.println(i);
        }
    }
}
