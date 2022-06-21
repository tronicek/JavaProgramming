package read;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Reading a binary file
 *
 * @author Zdenek Tronicek
 */
public class Main {

    static final int BUFSIZE = 64;

    public static void main(String[] args) {
        try ( FileInputStream in = new FileInputStream("build/classes/read/Main.class")) {
            byte[] buf = new byte[BUFSIZE];
            while (true) {
                int m = in.read(buf);
                if (m < 0) {
                    break;
                }
                for (int i = 0; i < m; i++) {
                    System.out.printf("%d ", buf[i]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
