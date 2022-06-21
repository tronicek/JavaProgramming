package ordered;

/**
 * The class represents a word and its frequency.
 * 
 * @author Zdenek Tronicek
 */
public class Pair implements Comparable<Pair> {

    private final String word;
    private final Integer freq;

    public Pair(String word, Integer freq) {
        this.word = word;
        this.freq = freq;
    }

    @Override
    public String toString() {
        return String.format("%s: %d", word, freq);
    }

    @Override
    public int compareTo(Pair p) {
        if (freq < p.freq) {
            return 1;
        }
        if (freq > p.freq) {
            return -1;
        }
        return word.compareTo(p.word);
    }
}
