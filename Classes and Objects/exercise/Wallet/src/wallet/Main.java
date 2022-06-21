package wallet;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Wallet mine = new Wallet(150, 80);
        System.out.printf("My wallet: $%d.%d%n", mine.getDollars(), mine.getCents());
        int[] d = mine.take(15, 50);
        System.out.printf("Taken $%d.%d%n", d[0], d[1]);
        System.out.printf("My wallet: $%d.%d%n", mine.getDollars(), mine.getCents());
    }
}
