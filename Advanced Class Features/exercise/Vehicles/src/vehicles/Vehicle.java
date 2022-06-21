package vehicles;

/**
 * Vehicle
 *
 * @author Zdenek Tronicek
 */
public class Vehicle {

    protected String make;
    protected String model;

    public void print() {
        System.out.printf("make: %s, model: %s%n", make, model);
    }
}
