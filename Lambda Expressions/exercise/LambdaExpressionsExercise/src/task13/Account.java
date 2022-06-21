package task13;

/**
 * Account
 *
 * @author Zdenek Tronicek
 */
public class Account {

    private static int cid = 100;
    private final int id;

    public Account() {
        id = cid;
        cid++;
    }

    @Override
    public String toString() {
        return String.format("Account: %d", id);
    }
}
