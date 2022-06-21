package rename;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Rename a file
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        try {
            Path source = Paths.get("copy.txt");
            Path target = Paths.get("renamed.txt");
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
