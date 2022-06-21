package write2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/**
 * Writing a text file line by line
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList(
                "Welcome to the Hotel California",
                "Such a lovely place (Such a lovely place)",
                "Such a lovely face",
                "Plenty of room at the Hotel California",
                "Any time of year (Any time of year)",
                "You can find it here");
        Charset cs = Charset.forName("UTF-8");
        try ( BufferedWriter out = new BufferedWriter(
                new FileWriter("output.txt", cs))) {
            for (String line : lines) {
                out.append(line);
                out.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
