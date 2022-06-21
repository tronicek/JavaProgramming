package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Display
 *
 * @author Zdenek Tronicek
 */
public class Display {

    private final List<Integer> digits = new ArrayList<>();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public Display() {
        digits.add(1);
        digits.add(2);
        digits.add(3);
        digits.add(4);
    }

    public void read() {
        String thread = Thread.currentThread().getName();
        readLock.lock();
        try {
            for (int i = 0; i < digits.size(); i++) {
                Integer digit = digits.get(i);
                System.out.printf("%s read %d: %d%n", thread, i, digit);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            readLock.unlock();
        }
    }

    public void write() {
        String thread = Thread.currentThread().getName();
        writeLock.lock();
        try {
            for (int i = 0; i < digits.size(); i++) {
                int digit = (digits.get(i) + 1) % 10;
                System.out.printf("%s write %d: %d%n", thread, i, digit);
                digits.set(i, digit);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            writeLock.unlock();
        }
    }
}
