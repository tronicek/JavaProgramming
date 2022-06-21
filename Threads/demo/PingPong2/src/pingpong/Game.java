package pingpong;

/**
 * Game
 *
 * @author Zdenek Tronicek
 */
public class Game {

    private volatile int value;

    public void ping() {
        value++;
        System.out.printf("ping %d%n", value);
    }

    public void pong() {
        value++;
        System.out.printf("pong %d%n", value);
    }

    public int getValue() {
        return value;
    }
}
