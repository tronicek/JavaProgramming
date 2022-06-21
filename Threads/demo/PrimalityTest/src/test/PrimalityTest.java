package test;

import java.math.BigInteger;

/**
 * Primality test
 *
 * @author Zdenek Tronicek
 */
public class PrimalityTest implements Runnable {

    private static final int CERTAINTY = 100;
    private final int exp;

    public PrimalityTest(int exp) {
        this.exp = exp;
    }

    @Override
    public void run() {
        BigInteger two = new BigInteger("2");
        BigInteger cand = two.pow(exp).subtract(BigInteger.ONE);
        boolean isPrime = cand.isProbablePrime(CERTAINTY);
        String s = isPrime ? "probably" : "not";
        System.out.printf("2^%d-1 is %s prime.%n", exp, s);
    }
}
