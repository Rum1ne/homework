public class Trinity<T extends Comparable<T>> implements Comparable<Trinity<T>> {
    public T first;
    public T second;
    public T third;

    public Trinity(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }


    public void sortTrinity() {
        T additional;
        if (first.compareTo(second) < 0) {
            additional = first;
            first = second;
            second = additional;
        }
        if (second.compareTo(third) < 0) {
            additional = second;
            second = third;
            third = additional;
            if (first.compareTo(second) < 0) {
                additional = first;
                first = second;
                second = additional;
            }
        }
    }

    @Override
    public int compareTo(Trinity<T> o) {
        return 0;
    }
}

