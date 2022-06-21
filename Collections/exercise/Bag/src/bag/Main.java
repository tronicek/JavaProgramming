package bag;

/**
 * Main
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Bag bag = new Bag(4);
        bag.add(2);
        bag.add(3);
        bag.add(5);
        bag.add(7);
        bag.add(11);
        for (String s : bag) {
            System.out.printf("%s ", s);
        }
        System.out.println();
    }
}
