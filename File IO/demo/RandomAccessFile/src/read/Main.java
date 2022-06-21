package read;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Random access file
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("expected arguments: file offset value");
            return;
        }
        String file = args[0];
        int offset = Integer.parseInt(args[1]);
        int value = Integer.parseInt(args[2]);
        try ( RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            raf.seek(offset);
            int orig = raf.read();
            System.out.printf("changing %d to %d%n", orig, value);
            raf.seek(offset);
            raf.write(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
