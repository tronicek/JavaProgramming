package sortedfiles;

/**
 * File record
 *
 * @author Zdenek Tronicek
 */
public class Record implements Comparable<Record> {

    private final long size;
    private final String name;

    public Record(long size, String name) {
        this.size = size;
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Record rec) {
        if (size > rec.size) {
            return -1;
        }
        if (size < rec.size) {
            return 1;
        }
        return name.compareTo(rec.name);
    }

    @Override
    public String toString() {
        return String.format("%d %s", size, name);
    }
}
