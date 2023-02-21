import java.util.Arrays;

public class BinarySearch<T extends Comparable<T>> {
    private T[] comparable_elements;
    public BinarySearch(T[] massive) {
        comparable_elements = massive;
    }
    public int search(Comparable<T> t) {
        for (T element : comparable_elements) {
            if (element.compareTo((T) t) == 0) {
                return Arrays.asList(comparable_elements).indexOf(element);
            }
        }
        return -1;
    }
}



