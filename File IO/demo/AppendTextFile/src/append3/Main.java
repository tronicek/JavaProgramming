package append3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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
                "'This could be Heaven or this could be Hell'",
                "Then she lit up a candle and she showed me the way",
                "There were voices down the corridor,",
                "I thought I heard them say...");
        Path output = Paths.get("journal.txt");
        Charset cs = Charset.forName("UTF-8");
        try ( BufferedWriter out = Files.newBufferedWriter(
                output, cs, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            for (String line : lines) {
                out.append(line);
                out.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
