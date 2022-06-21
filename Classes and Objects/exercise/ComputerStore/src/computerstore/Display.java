package computerstore;

/**
 * Display
 *
 * @author Zdenek Tronicek
 */
public class Display {

    private String inches;
    private int width;
    private int height;

    public Display(String inches, int width, int height) {
        this.inches = inches;
        this.width = width;
        this.height = height;
    }

    public void print() {
        System.out.printf("Display %s inches, resolution %dx%d%n", inches, width, height);
    }
}
