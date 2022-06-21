package randomness;

import java.util.Random;

/**
 * Randomness
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    static final int COUNT = 6;
    
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.print("Your lucky numbers are ");
        for (int i = 0; i < COUNT; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            int m = 1 + rand.nextInt(49);
            System.out.print(m);
        }
        System.out.println(".");
    }
}
