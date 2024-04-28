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

    // Constructor
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add an element to the end of the list
    @Override
    public void add(T item) {
        addLast(item);
    }

    // Add an element at the specified index
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

    // Add an element to the beginning of the list
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

    // Add an element to the end of the list
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

    // Get the element at the specified index
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return getNode(index).element;
    }

    // Get the first element of the list
    @Override
    public T getFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return head.element;
    }

    // Get the last element of the list
    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return tail.element;
    }

    // Set the element at the specified index to a new value
    @Override
    public void set(int index, T item) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        getNode(index).element = item;
    }

    // Remove the element at the specified index
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

    // Remove the first element of the list
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

    // Remove the last element of the list
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

    // Sort the list
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

    // Get the index of the first occurrence of the specified element
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

    // Get the index of the last occurrence of the specified element
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

    // Check if the specified element exists in the list
    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    // Convert the list to an array
    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int index = 0;
        for (MyNode<T> current = head; current != null; current = current.next) {
            array[index++] = current.element;
        }
        return array;
    }

    // Clear the list
    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    // Get the size of the list
    @Override
    public int size() {
        return size;
    }

    // Get the node at the specified index
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

    // Iterator for iterating over the list
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

    // Check if the list is empty
    private boolean isEmpty() {
        return size == 0;
    }

    // Method to print the elements of the list
    public void printArr(){
        MyNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.element + " ");
            currentNode = currentNode.next;
        }
        System.out.println("\n");
    }
}
