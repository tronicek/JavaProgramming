package treemap;

import java.util.Comparator;

/**
 * String comparator
 *
 * @author Zdenek Tronicek
 */
public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 < len2) {
            return -1;
        }
        if (len1 > len2) {
            return 1;
        }
        return s1.compareTo(s2);
    }
}
