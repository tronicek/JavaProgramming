package sortfile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Sort a file
 *
 * @author Zdenek Tronicek
 */
public class Main {

    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("expected argument: infile outfile");
                return;
            }
            sort(args[0], args[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void sort(String infile, String outfile) throws IOException {
        List<Integer> nums = new ArrayList<>();
        try ( DataInputStream in = new DataInputStream(new FileInputStream(infile))) {
            int count = in.readInt();
            for (; count > 0; count--) {
                int m = in.readInt();
                nums.add(m);
            }
        }
        Collections.sort(nums);
        try ( DataOutputStream out = new DataOutputStream(new FileOutputStream(outfile))) {
            out.writeInt(nums.size());
            for (Integer m : nums) {
                out.writeInt(m);
            }
        }
    }
}
