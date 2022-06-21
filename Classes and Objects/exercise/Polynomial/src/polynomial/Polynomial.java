package polynomial;

/**
 * Class Polynomial represents a polynomial with integer coefficients.
 *
 * @author Zdenek Tronicek
 */
public class Polynomial {

    private int[] coeff;

    public Polynomial(int[] coeff) {
        this.coeff = coeff.clone();
    }

    public int evaluate(int x) {
        int val = 0, xp = 1;
        for (int i = 0; i < coeff.length; i++) {
            val += coeff[i] * xp;
            xp *= x;
        }
        return val;
    }

    public void add(Polynomial p) {
        int m = Math.max(coeff.length, p.coeff.length);
        int[] sum = new int[m];
        System.arraycopy(coeff, 0, sum, 0, coeff.length);
        for (int i = 0; i < p.coeff.length; i++) {
            sum[i] += p.coeff[i];
        }
        coeff = reduce(sum);
    }

    private int[] reduce(int[] cc) {
        int i = cc.length - 1;
        while (i > 0 && cc[i] == 0) {
            i--;
        }
        int len = i + 1;
        if (len < cc.length) {
            int[] cc2 = new int[len];
            System.arraycopy(cc, 0, cc2, 0, len);
            return cc2;
        }
        return cc;
    }

    public void print() {
        boolean first = true;
        if (coeff[0] != 0 || coeff.length == 1) {
            System.out.printf("%d", coeff[0]);
            first = false;
        }
        for (int i = 1; i < coeff.length; i++) {
            if (coeff[i] == 0) {
                continue;
            }
            String conv = first ? "%dx" : "%+dx";
            System.out.printf(conv, coeff[i]);
            if (i > 1) {
                System.out.printf("^%d", i);
            }
            first = false;
        }
        System.out.println();
    }
}
