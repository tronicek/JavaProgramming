package oddeven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Odd-Even
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m != 0) {
            nums.add(m);
            m = sc.nextInt();
        }
        for (int i = 0; i < nums.size(); i += 2) {
            Integer num = nums.get(i);
            System.out.printf("%d ", num);
        }
        for (int i = 1; i < nums.size(); i += 2) {
            Integer num = nums.get(i);
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
