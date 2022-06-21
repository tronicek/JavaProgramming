package read2;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Reading a binary file
 *
 * @author Zdenek Tronicek
 */
public class Main {

    static final int BUFSIZE = 64;
    static final int LINE = 30;

    public static void main(String[] args) {
        int c = 0;
        try ( DataInputStream in = new DataInputStream(
                new FileInputStream("build/classes/read/Main.class"))) {
            while (true) {
                int m = in.readInt();
                System.out.printf("%x ", m);
                c++;
                if (c % LINE == 0) {
                    System.out.println();
                }
            }
        } catch (EOFException e) {
            if (c % LINE != 0) {
                System.out.println();
            }
            System.out.printf("%d int value(s)%n", c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
