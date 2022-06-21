package write;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Writing a binary file
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        try ( FileOutputStream out = new FileOutputStream("output")) {
            byte[] buf = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
            out.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
