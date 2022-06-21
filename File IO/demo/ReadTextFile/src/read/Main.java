package read;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Reading all lines of a text file
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        try {
            Path input = Paths.get("input.txt");
            Charset cs = Charset.forName("UTF-8");
            List<String> lines = Files.readAllLines(input, cs);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
