package postfix;

/**
 * A fixed-size stack
 *
 * @author Zdenek Tronicek
 */
public class Stack {

    private final int[] values;
    private int index;

    public Stack(int size) {
        values = new int[size];
    }

    public void push(int value) throws StackException {
        if (index == values.length) {
            throw new StackException("stack is full");
        }
        values[index] = value;
        index++;
    }

    public int pop() throws StackException {
        if (index == 0) {
            throw new StackException("stack is empty");
        }
        index--;
        return values[index];
    }

    public boolean isEmpty() {
        return index == 0;
    }
}
