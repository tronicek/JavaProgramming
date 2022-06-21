package write4;

import java.io.IOException;
import java.io.PrintWriter;
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
                "Her mind is Tiffany-twisted, she got the Mercedes Benz",
                "She got a lot of pretty, pretty boys she calls friends",
                "How they dance in the courtyard, sweet summer sweat.",
                "Some dance to remember, some dance to forget");
        Charset cs = Charset.forName("UTF-8");
        try ( PrintWriter out = new PrintWriter("output.txt", cs)) {
            for (String line : lines) {
                out.println(line);
            }
            if (out.checkError()) {
                System.out.println("I/O Error");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
