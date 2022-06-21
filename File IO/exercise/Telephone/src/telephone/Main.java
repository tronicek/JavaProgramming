package telephone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Telephone game
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("expected argument: file");
            return;
        }
        Path file = Paths.get(args[0]);
        Charset cs = Charset.forName("UTF-8");
        try ( BufferedReader in = Files.newBufferedReader(file, cs)) {
            String line, last = null;
            while ((line = in.readLine()) != null) {
                last = line;
            }
            if (last != null) {
                System.out.println(last);
            }
            try ( BufferedWriter out = Files.newBufferedWriter(file, cs, StandardOpenOption.APPEND)) {
                Scanner sc = new Scanner(System.in);
                String msg = sc.nextLine();
                out.append(msg);
                out.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
