package write3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
                "They livin' it up at the Hotel California",
                "What a nice surprise (what a nice surprise)",
                "Bring your alibis");
        Path output = Paths.get("output.txt");
        Charset cs = Charset.forName("UTF-8");
        try ( BufferedWriter out = Files.newBufferedWriter(output, cs)) {
            for (String line : lines) {
                out.append(line);
                out.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
