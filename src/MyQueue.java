public class MyQueue<T> implements MyList<T> {
    private final MyList<T> list;

    public MyQueue() {
        this.list = new MyLinkedList<>();
    }

    @Override
    public void add(T item) {
        list.addLast(item);
    }

    @Override
    public void set(int index, T item) {
        list.set(index, item);
    }

    @Override
    public void add(int index, T item) {
        list.add(index, item);
    }

    @Override
    public void addFirst(T item) {
        list.addFirst(item);
    }

    @Override
    public void addLast(T item) {
        list.addLast(item);
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public T getFirst() {
        return list.getFirst();
    }

    @Override
    public T getLast() {
        return list.getLast();
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }

    @Override
    public void removeFirst() {
        list.removeFirst();
    }

    @Override
    public void removeLast() {
        list.removeLast();
    }

    @Override
    public void sort() {
        list.sort();
    }

    @Override
    public int indexOf(Object object) {
        return list.indexOf(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return list.lastIndexOf(object);
    }

    @Override
    public boolean exists(Object object) {
        return list.exists(object);
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size();
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                return list.get(currentIndex++);
            }
        };
    }

    public void enqueue(T item) {
        addLast(item);
    }

    public T dequeue() {
        if (size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = getFirst();
        removeFirst();
        return item;
    }

    public T peek() {
        if (size() == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return getFirst();
    }
}
