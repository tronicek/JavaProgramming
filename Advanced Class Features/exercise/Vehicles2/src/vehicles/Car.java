package vehicles;

/**
 * Car
 *
 * @author Zdenek Tronicek
 */
public class Car extends Vehicle {

    protected String color;

    public Car(String make, String model, String color) {
        super(make, model);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.printf("make: %s, model: %s, color: %s%n", make, model, color);
    }
}
