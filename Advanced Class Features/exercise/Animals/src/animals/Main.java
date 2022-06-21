package animals;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Animals
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Bird("Emma");
        animals[1] = new Cat("Lucy");
        animals[2] = new Dog("Pilot");
        animals[3] = new Snake("Monty");
        animals[4] = new Cat("Gala");
        animals[5] = new Dog("Cooper");
        Arrays.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                String name1 = a1.getName();
                String name2 = a2.getName();
                return name1.compareTo(name2);
            }
        });
        for (Animal animal : animals) {
            animal.print();
        }
    }
}
