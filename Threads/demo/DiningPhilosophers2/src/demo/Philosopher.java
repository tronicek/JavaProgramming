package demo;

import java.util.Random;

/**
 * Philosopher
 *
 * @author Zdenek Tronicek
 */
public class Philosopher implements Runnable {

    private final int id;
    private final Fork left;
    private final Fork right;
    private final Random rand = new Random();

    public Philosopher(int id, Fork left, Fork right) {
        this.id = id;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        while (true) {
            think();
            if (left.getId() < right.getId()) {
                left.pickUp();
                right.pickUp();
            } else {
                right.pickUp();
                left.pickUp();
            }
            eat();
            left.putDown();
            right.putDown();
        }
    }

    private void think() {
        System.out.printf("Philosopher %d is thinking...%n", id);
        sleep();
        System.out.printf("Philosopher %d finished thinking...%n", id);
    }

    private void eat() {
        System.out.printf("Philosopher %d is eating...%n", id);
        sleep();
        System.out.printf("Philosopher %d finished eating...%n", id);
    }

    private void sleep() {
        int t = rand.nextInt(2);
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
