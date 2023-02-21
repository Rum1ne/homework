import java.util.*;

public class MyArrayList<T> implements Iterable<T> {

    private Object[] data;
    private int capacity;
    private int size;

    public int size() {
        return size;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index: " + index + " size: " + size);
        return (T) data[index];
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index: " + index + " size: " + size);
        data[index] = value;
    }

    public void add(T value) {
        if (capacity == size) {
            capacity *= 1.5;
            Object[] newData = new Object[capacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size] = value;
        ++size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index: " + index + " size: " + size);
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[size - 1] = null;
        --size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements Iterator<T> {
        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < size;
        }

        @Override
        public T next() {
            return (T) data[position++];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(position);
        }
    }


    public boolean addAll(Collection<? extends T> c) {
        Object[] data = c.toArray();
        int numNew = data.length;
        if (numNew == 0)
            return false;
        Object[] newData = new Object[0];
        final int s;
        if (numNew > newData.length - (s = capacity))
            newData = grow(s + numNew);
        System.arraycopy(data, 0, newData, s, numNew);
        capacity = s + numNew;
        return true;

    }

    transient Object[] elementData;

    private Object[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData,
                newCapacity(minCapacity));
    }

    private final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    private int newCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity <= 0) {
            if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
                return Math.max(10, minCapacity);
            if (minCapacity < 0)
                throw new OutOfMemoryError();
            return minCapacity;
        }
        return (newCapacity - Integer.MAX_VALUE + 8 <= 0) ? newCapacity : hugeCapacity(minCapacity);
    }

    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0)
            throw new OutOfMemoryError();
        return (minCapacity > Integer.MAX_VALUE - 8) ? Integer.MAX_VALUE : Integer.MAX_VALUE - 8;
    }



    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }


    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < data.length; i++)
                if (data[i] == null)
                    return i;
        } else {
            for (int i = 0; i < data.length; i++)
                if (o.equals(data[i]))
                    return i;
        }
        return -1;
    }


}
