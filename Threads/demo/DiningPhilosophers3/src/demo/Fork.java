package demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Fork
 *
 * @author Zdenek Tronicek
 */
public class Fork {

    private final int id;
    private State state;
    private final Lock lock = new ReentrantLock();
    private final Condition onTable = lock.newCondition();

    public enum State {
        PICKED_UP, PUT_DOWN
    }

    public Fork(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void pickUp() {
        lock.lock();
        try {
            while (state == State.PICKED_UP) {
                try {
                    onTable.await();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.printf("Fork %d is being picked up...%n", id);
            state = State.PICKED_UP;
        } finally {
            lock.unlock();
        }
    }

    public void putDown() {
        lock.lock();
        try {
            System.out.printf("Fork %d is being put down...%n", id);
            state = State.PUT_DOWN;
            onTable.signal();
        } finally {
            lock.unlock();
        }
    }
}
