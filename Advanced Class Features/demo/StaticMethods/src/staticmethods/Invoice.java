package staticmethods;

import java.math.BigDecimal;

/**
 * Invoice
 *
 * @author Zdenek Tronicek
 */
public class Invoice {

    private static int count;
    private final int id;
    private final BigDecimal amount;

    public Invoice(BigDecimal amount) {
        count++;
        this.id = count;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("invoice %d for $%s", id, amount);
    }
}
