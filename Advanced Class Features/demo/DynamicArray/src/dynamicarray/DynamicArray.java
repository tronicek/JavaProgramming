package dynamicarray;

import java.util.Iterator;

/**
 * Dynamic array
 *
 * @author Zdenek Tronicek
 */
public class DynamicArray implements Iterable<Integer> {

    private int[] values;
    private int count;

    public DynamicArray(int size) {
        values = new int[size];
    }

    public void add(int value) {
        if (count == values.length) {
            int[] p = new int[values.length * 2];
            System.arraycopy(values, 0, p, 0, values.length);
            values = p;
        }
        values[count] = value;
        count++;
    }

    public int get(int index) {
        return values[index];
    }

    @Override
    public Iterator<Integer> iterator() {
        return new DAIterator();
    }

    private class DAIterator implements Iterator<Integer> {

        int current;

        @Override
        public boolean hasNext() {
            return current < count;
        }

        @Override
        public Integer next() {
            return values[current++];
        }
    }
}
