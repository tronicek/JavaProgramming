package displayfile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Display a file
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        try {
            if (args.length != 1) {
                System.out.println("expected argument: file");
                return;
            }
            display(args[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void display(String file) throws IOException {
        try ( DataInputStream in = new DataInputStream(new FileInputStream(file))) {
            int count = in.readInt();
            for (; count > 0; count--) {
                int m = in.readInt();
                System.out.printf("%d ", m);
            }
            System.out.println();
        }
    }
}
