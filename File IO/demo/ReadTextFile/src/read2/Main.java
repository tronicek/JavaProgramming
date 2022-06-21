package read2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Reading a text file line by line
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        Charset cs = Charset.forName("UTF-8");
        try ( BufferedReader in = new BufferedReader(
                new FileReader("input.txt", cs))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
