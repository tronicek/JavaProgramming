package stack;

/**
 * Generic stack
 * 
 * @author Zdenek Tronicek
 * @param <T>
 */
public class Stack<T> {
    
    private final Object[] values;
    private int index;

    public Stack(int size) {
        values = new Object[size];
    }
    
    public void push(T value) {
        values[index] = value;
        index++;
    }
    
    public T pop() {
        index--;
        return (T) values[index];
    }
    
    public boolean isEmpty() {
        return index == 0;
    }
}
