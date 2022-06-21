package pingpong;

/**
 * Ping
 *
 * @author Zdenek Tronicek
 */
public class Ping implements Runnable {

    private final Game game;

    public Ping(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        while (true) {
            while (game.getValue() % 2 == 1) {
            }
            game.ping();
        }
    }
}
