package car;

/**
 * Car
 *
 * @author Zdenek Tronicek
 */
public class Car {

    private String make;
    private String color;

    public Car(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public void print() {
        System.out.printf("%s, %s%n", make, color);
    }
}
