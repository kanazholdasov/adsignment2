import java.util.Iterator;

public class MyArrayList<K> implements MyList<K> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Method to increase the buffer size
    private void increaseBuffer() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    // Method to check if the index is within bounds
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index not correct");
        }
    }

    // Method to check index of array when adding an element at position
    private void addCheckIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index not correct");
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void add(K item) {
        if (size == elements.length) {
            increaseBuffer();
        }
        elements[size++] = item;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void add(int index, K item) {
        addCheckIndex(index);
        if (size == elements.length) {
            increaseBuffer();
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = item;
        size++;
    }

    @Override
    public void addFirst(K item) {
        add(0, item);
    }

    @Override
    public void addLast(K item) {
        add(size, item);
    }

    @SuppressWarnings("unchecked")
    @Override
    public K get(int index) {
        checkIndex(index);
        return (K) elements[index];
    }

    @Override
    public K getFirst() {
        return get(0);
    }

    @Override
    public K getLast() {
        return get(size - 1);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void set(int index, K item) {
        checkIndex(index);
        elements[index] = item;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        remove(size - 1);
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<K>) elements[j]).compareTo((K) elements[j + 1]) > 0) {
                    K temp = (K) elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public int indexOf(Object object) {
        if (object == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (object.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        if (object == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (object.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) >= 0;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        System.arraycopy(elements, 0, array, 0, size);
        return array;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    // Method to print the elements of the array list
    public void printArr() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println("\n");
    }

    @Override
    public Iterator<K> iterator() {
        return new Iterator<K>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @SuppressWarnings("unchecked")
            @Override
            public K next() {
                return (K) elements[currentIndex++];
            }
        };
    }
}
