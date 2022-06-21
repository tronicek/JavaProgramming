package interfaces;

import java.util.Arrays;
import pets.Cat;
import pets.Dog;
import pets.Pet;

/**
 * Interfaces
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Pet[] pets = new Pet[5];
        pets[0] = new Cat("Lucy");
        pets[1] = new Cat("Gala");
        pets[2] = new Dog("Max");
        pets[3] = new Dog("Cooper");
        pets[4] = new Dog("Charlie");
        Arrays.sort(pets);
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
}
