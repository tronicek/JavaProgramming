package task13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * A reference to a constructor
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<Account> acc = new ArrayList<>();
        fill(acc, Account::new);
        for (Account ac : acc) {
            System.out.println(ac);
        }
    }

    static void fill(List<Account> acc, Supplier<Account> supp) {
        for (int i = 0; i < 5; i++) {
            acc.add(supp.get());
        }
    }
}
