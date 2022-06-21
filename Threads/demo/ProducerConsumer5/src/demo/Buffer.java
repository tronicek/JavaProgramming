package demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Shared buffer
 *
 * @author Zdenek Tronicek
 */
public class Buffer {

    private final char[] values;
    private int index;
    private final Lock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public Buffer(int size) {
        values = new char[size];
    }

    public void push(char c) {
        lock.lock();
        try {
            while (index == values.length) {
                try {
                    notFull.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            values[index] = c;
            index++;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public char pop() {
        lock.lock();
        try {
            while (index == 0) {
                try {
                    notEmpty.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notFull.signal();
            index--;
            return values[index];
        } finally {
            lock.unlock();
        }
    }
}
