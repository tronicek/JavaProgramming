package read3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Reading a text file line by line
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Path input = Paths.get("input.txt");
        Charset cs = Charset.forName("UTF-8");
        try ( BufferedReader in = Files.newBufferedReader(input, cs)) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
