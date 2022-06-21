package vehicles;

/**
 * Vehicle
 *
 * @author Zdenek Tronicek
 */
public class Vehicle {

    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void print() {
        System.out.printf("make: %s, model: %s%n", make, model);
    }
}
