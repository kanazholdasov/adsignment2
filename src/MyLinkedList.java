import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private static class MyNode<T> {
        T element;
        MyNode<T> next;
        MyNode<T> prev;

        MyNode(T element, MyNode<T> prev, MyNode<T> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void add(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            MyNode<T> current = getNode(index);
            MyNode<T> newNode = new MyNode<>(item, current.prev, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    @Override
    public void addFirst(T item) {
        if (isEmpty()) {
            head = tail = new MyNode<>(item, null, null);
        } else {
            MyNode<T> newNode = new MyNode<>(item, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        if (isEmpty()) {
            head = tail = new MyNode<>(item, null, null);
        } else {
            MyNode<T> newNode = new MyNode<>(item, tail, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return getNode(index).element;
    }

    @Override
    public T getFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return head.element;
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return tail.element;
    }

    @Override
    public void set(int index, T item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        getNode(index).element = item;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        MyNode<T> current = getNode(index);
        if (current.prev == null) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }
        if (current.next == null) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        size--;
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
    }

    @Override
    public void removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        size--;
    }

    @Override
    public void sort() {
        for (MyNode i = head; i != null; i = i.next) {
            for (MyNode j = i.next; j != null; j = j.next) {
                if (((Comparable<T>) i.element).compareTo((T) j.element) > 0) {
                    T temp = (T) i.element;
                    i.element = j.element;
                    j.element = temp;
                }
            }
        }

    }

    @Override
    public int indexOf(Object object) {
        int index = 0;
        if (object == null) {
            for (MyNode<T> current = head; current != null; current = current.next) {
                if (current.element == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (MyNode<T> current = head; current != null; current = current.next) {
                if (object.equals(current.element)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int index = size - 1;
        if (object == null) {
            for (MyNode<T> current = tail; current != null; current = current.prev) {
                if (current.element == null) {
                    return index;
                }
                index--;
            }
        } else {
            for (MyNode<T> current = tail; current != null; current = current.prev) {
                if (object.equals(current.element)) {
                    return index;
                }
                index--;
            }
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int index = 0;
        for (MyNode<T> current = head; current != null; current = current.next) {
            array[index++] = current.element;
        }
        return array;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private MyNode<T> getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private MyNode<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new IllegalStateException("No more elements");
                }
                T element = current.element;
                current = current.next;
                return element;
            }
        };
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void printArr(){
        MyNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.element + " ");
            currentNode = currentNode.next;
        }
        System.out.println("\n");
    }
}
