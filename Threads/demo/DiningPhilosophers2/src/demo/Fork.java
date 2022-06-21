package demo;

/**
 * Fork
 *
 * @author Zdenek Tronicek
 */
public class Fork {

    private final int id;
    private State state;

    public enum State {
        PICKED_UP, PUT_DOWN
    }

    public Fork(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public synchronized void pickUp() {
        while (state == State.PICKED_UP) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.printf("Fork %d is being picked up...%n", id);
        state = State.PICKED_UP;
    }

    public synchronized void putDown() {
        System.out.printf("Fork %d is being put down...%n", id);
        state = State.PUT_DOWN;
        notify();
    }
}
