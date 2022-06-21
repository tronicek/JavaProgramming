package demo;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Student jeff = new Student("Jeff Bezos", "Los Angeles", "jeff@amazon.com");
        Student elon = new Student("Elon Musk", "Austin", "elon@spacex.com");
        jeff.print();
        elon.print();
    }
}
