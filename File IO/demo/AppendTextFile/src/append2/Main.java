package append2;

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
                "I had to stop for the night",
                "There she stood in the doorway;",
                "I heard the mission bell",
                "And I was thinking to myself,");
        Charset cs = Charset.forName("UTF-8");
        try ( BufferedWriter out = new BufferedWriter(
                new FileWriter("journal.txt", cs, true))) {
            for (String line : lines) {
                out.append(line);
                out.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
