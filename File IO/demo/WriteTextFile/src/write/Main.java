package write;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Writing all lines of a text file
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        try {
            Path output = Paths.get("output.txt");
            List<String> lines = Arrays.asList(
                    "Welcome to the Hotel California",
                    "Such a lovely place (Such a lovely place)",
                    "Such a lovely face",
                    "Plenty of room at the Hotel California",
                    "Any time of year (Any time of year)",
                    "You can find it here");
            Files.write(output, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
