package grep;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Grep
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("expected arguments: file string");
            return;
        }
        String file = args[0];
        String str = args[1];
        Path fpath = Paths.get(file);
        Charset cs = Charset.forName("UTF-8");
        try ( BufferedReader in = Files.newBufferedReader(fpath, cs)) {
            String line;
            while ((line = in.readLine()) != null) {
                if (line.contains(str)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
