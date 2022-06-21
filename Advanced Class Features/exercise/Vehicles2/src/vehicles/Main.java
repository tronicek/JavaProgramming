package vehicles;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", "brown");
        car.print();
        Motorcycle moto = new Motorcycle("Harley-Davidson", "Forty-Eight", 1);
        moto.print();
    }
}
