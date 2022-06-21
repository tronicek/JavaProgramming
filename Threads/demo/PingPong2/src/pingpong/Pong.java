package pingpong;

/**
 * Pong
 *
 * @author Zdenek Tronicek
 */
public class Pong implements Runnable {

    private final Game game;

    public Pong(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        while (true) {
            while (game.getValue() % 2 == 0) {
            }
            game.pong();
        }
    }
}
