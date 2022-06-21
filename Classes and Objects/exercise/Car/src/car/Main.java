package car;

/**
 * Main
 * 
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Car ford = new Car("Ford", "blue");
        Car toyota = new Car("Toyota", "white");
        ford.print();
        toyota.print();
    }
}
