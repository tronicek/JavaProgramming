package vehicles;

/**
 * Motorcycle
 *
 * @author Zdenek Tronicek
 */
public class Motorcycle extends Vehicle {

    protected int seats;

    public Motorcycle(String make, String model, int seats) {
        this.make = make;
        this.model = model;
        this.seats = seats;
    }

    @Override
    public void print() {
        System.out.printf("make: %s, model: %s, seats: %d%n", make, model, seats);
    }
}
