package append;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

/**
 * Appending to a text file
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        try {
            Path output = Paths.get("journal.txt");
            List<String> lines = Arrays.asList(
                    "On a dark desert highway, cool wind in my hair",
                    "Warm smell of colitas, rising up through the air",
                    "Up ahead in the distance, I saw shimmering light",
                    "My head grew heavy and my sight grew dim");
            Files.write(output, lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
