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

    public void push(char value) {
        values[index] = value;
        index++;
    }

    public char pop() {
        index--;
        return values[index];
    }

    public boolean isEmpty() {
        return index == 0;
    }
}
