package demo;

/**
 * Shared buffer
 *
 * @author Zdenek Tronicek
 */
public class Buffer {

    private final char[] values;
    private int index;

    public Buffer(int size) {
        values = new char[size];
    }

    public synchronized void push(char value) {
        while (index == values.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        values[index] = value;
        index++;
        notifyAll();
    }

    public synchronized char pop() {
        while (index == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notify();
        index--;
        return values[index];
    }

    public boolean isEmpty() {
        return index == 0;
    }
}
