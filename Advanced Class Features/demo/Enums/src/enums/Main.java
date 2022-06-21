package enums;

import java.util.Scanner;

/**
 * Enums
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Season s = Season.valueOf(str);
        if (s == Season.SUMMER) {
            System.out.println("No snow expected.");
        }
    }
}
