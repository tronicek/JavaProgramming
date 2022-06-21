package write2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Writing a binary file
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("output"))) {
            for (int i = 1; i < 50; i++) {
                out.writeInt(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
