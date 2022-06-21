package bag;

import java.util.Iterator;

/**
 * Bag
 *
 * @author Zdenek Tronicek
 */
public class Bag implements Iterable<String> {

    private int[] values;
    private int index;

    public Bag() {
        this(16);
    }

    public Bag(int initialSize) {
        values = new int[initialSize];
    }

    public void add(int value) {
        if (index == values.length) {
            int[] p = new int[values.length * 2];
            System.arraycopy(values, 0, p, 0, values.length);
            values = p;
        }
        values[index] = value;
        index++;
    }

    private class BagIterator implements Iterator<String> {

        private int current;

        @Override
        public boolean hasNext() {
            return current < index;
        }

        @Override
        public String next() {
            int val = values[current];
            current++;
            return Integer.toBinaryString(val);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new BagIterator();
    }
}
