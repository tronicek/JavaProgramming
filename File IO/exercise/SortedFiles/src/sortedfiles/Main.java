package sortedfiles;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;

/**
 * Sorted files
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("expected arguments: dir");
            return;
        }
        Path dir = Paths.get(args[0]);
        try (DirectoryStream<Path> files = Files.newDirectoryStream(dir)) {
            Set<Record> recs = new TreeSet<>();
            for (Path file : files) {
                if (Files.isRegularFile(file)) {
                    long size = Files.size(file);
                    Path name = file.getFileName();
                    Record rec = new Record(size, name.toString());
                    recs.add(rec);
                }
            }
            for (Record rec : recs) {
                System.out.println(rec);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
