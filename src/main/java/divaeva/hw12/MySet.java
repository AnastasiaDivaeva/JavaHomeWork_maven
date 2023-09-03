package divaeva.hw12;

import java.util.Arrays;

public class MySet<T> {
    public T[] items;
    private int size;

    public MySet(int initialCapacity) {
        items = (T[]) new Object[initialCapacity];
    }

    public boolean contains(T item) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MySet{" +
                "items=" + Arrays.toString(Arrays.copyOf(items, size)) +
                '}';
    }

    public void add(T item) {
        if (!contains(item)) {
            if (size == items.length) {
                int newCapacity = (int) (items.length * 1.75);
                items = Arrays.copyOf(items, newCapacity);
            }
            items[size] = item;
            size++;
        }

    }

    public T get(int index) {
        return items[index];
    }
}





