package wallet;

/**
 * Wallet
 *
 * @author Zdenek Tronicek
 */
public class Wallet {

    private int dollars;
    private int cents;

    public Wallet(int dollars) {
        this(dollars, 0);
    }

    public Wallet(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public void add(int dollars) {
        this.dollars += dollars;
    }

    public void add(int dollars, int cents) {
        this.dollars += dollars;
        this.cents += cents;
    }

    public int take(int dollars) {
        int d = Math.min(this.dollars, dollars);
        this.dollars -= d;
        return d;
    }

    public int[] take(int dollars, int cents) {
        int d = Math.min(this.dollars, dollars);
        this.dollars -= d;
        int c = Math.min(this.cents, cents);
        this.cents -= c;
        return new int[]{d, c};
    }
}
