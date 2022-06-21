package task9;

/**
 * Person
 * 
 * @author Zdenek Tronicek
 */
public class Person {

    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public static int compare(Person p1, Person p2) {
        if (p1.getHeight() < p2.getHeight()) {
            return -1;
        }
        if (p1.getHeight() > p2.getHeight()) {
            return 1;
        }
        String n1 = p1.getName();
        String n2 = p2.getName();
        return n1.compareTo(n2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("%s, %d cm", name, height);
    }
}
