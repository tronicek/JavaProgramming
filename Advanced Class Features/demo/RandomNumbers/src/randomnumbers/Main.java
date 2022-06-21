package randomnumbers;

import java.util.Random;

/**
 * Random numbers
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Random rand = new Random(73);
        for (int i = 0; i < 10; i++) {
            int m = rand.nextInt();
            System.out.printf("%d ", m);
        }
        System.out.println();
    }
}
