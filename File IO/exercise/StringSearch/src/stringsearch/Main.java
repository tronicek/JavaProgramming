package stringsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * String search
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("expected arguments: string dir");
            return;
        }
        String str = args[0];
        Path dir = Paths.get(args[1]);
        try (DirectoryStream<Path> files = Files.newDirectoryStream(dir, "*.txt")) {
            for (Path file : files) {
                if (Files.isRegularFile(file) && contains(file, str)) {
                    System.out.println(file.getFileName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static boolean contains(Path file, String str) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(file)) {
            String line;
            while ((line = in.readLine()) != null) {
                if (line.contains(str)) {
                    return true;
                }
            }
            return false;
        }
    }
}
