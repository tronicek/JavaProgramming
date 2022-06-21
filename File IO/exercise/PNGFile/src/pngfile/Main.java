package pngfile;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * PNG File
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("expected argument: file");
            return;
        }
        String file = args[0];
        try ( FileInputStream in = new FileInputStream(file)) {
            byte[] buf = new byte[8];
            in.read(buf);
            if (buf[0] == (byte) 137 && buf[1] == 80
                    && buf[2] == 78 && buf[3] == 71
                    && buf[4] == 13 && buf[5] == 10
                    && buf[6] == 26 && buf[7] == 10) {
                System.out.println("PNG file");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
