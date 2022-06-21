package pingpong;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Ping ping = new Ping(game);
        Pong pong = new Pong(game);
        new Thread(ping).start();
        new Thread(pong).start();
    }
}
