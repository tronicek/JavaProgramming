package generatefile;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Generate a file
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                System.out.println("expected arguments: file count range");
                return;
            }
            String file = args[0];
            int count = Integer.parseInt(args[1]);
            int range = Integer.parseInt(args[2]);
            generate(file, count, range);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void generate(String outfile, int count, int range) throws IOException {
        try ( DataOutputStream out = new DataOutputStream(new FileOutputStream(outfile))) {
            out.writeInt(count);
            Random rand = new Random();
            for (int i = 0; i < count; i++) {
                int m = rand.nextInt(range);
                out.writeInt(m);
            }
        }
    }
}
