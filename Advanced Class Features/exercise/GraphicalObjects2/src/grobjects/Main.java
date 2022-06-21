package grobjects;

import java.util.Random;

/**
 * Graphical objects
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        GrObject[] gobs = new GrObject[5];
        for (int i = 0; i < gobs.length; i++) {
            gobs[i] = randomObject();
        }
        for (GrObject gob : gobs) {
            gob.draw();
        }
    }

    static GrObject randomObject() {
        Random rand = new Random();
        int type = rand.nextInt(4);
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        switch (type) {
            case 0:
                int rad = 1 + rand.nextInt(20);
                return new Circle(x, y, rad);
            case 1:
                int a = 1 + rand.nextInt(10);
                int b = 1 + rand.nextInt(10);
                return new Ellipse(x, y, a, b);
            case 2:
                int side = 1 + rand.nextInt(30);
                return new Square(x, y, side);
            case 3:
            default:
                int width = 1 + rand.nextInt(20);
                int height = 1 + rand.nextInt(30);
                return new Rectangle(x, y, width, height);
        }
    }
}
