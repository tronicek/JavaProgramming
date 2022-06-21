package whitespaces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * White spaces
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("expected arguments: input output");
            return;
        }
        Path input = Paths.get(args[0]);
        Path output = Paths.get(args[1]);
        Charset cs = Charset.forName("UTF-8");
        try (BufferedReader in = Files.newBufferedReader(input, cs);
                BufferedWriter out = Files.newBufferedWriter(output, cs)) {
            String line;
            while ((line = in.readLine()) != null) {
                String mod = line.trim().replaceAll("\\s+", " ");
                out.append(mod);
                out.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
