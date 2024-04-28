public class MyMinHeap<K extends Comparable<K>> extends MyLinkedList {
    private MyArrayList<K> heap;

    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return heap.size();
    }

    public K getMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap.get(0);
    }

    public K extractMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        K min = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapify(0);
        return min;
    }

    public void insert(K item) {
        heap.add(item);
        traverseUp(heap.size() - 1);
    }

    private void heapify(int index) {
        int left = leftChildOf(index);
        int right = rightChildOf(index);
        int smallest = index;

        if (left < heap.size() && heap.get(left).compareTo(heap.get(smallest)) < 0) {
            smallest = left;
        }

        if (right < heap.size() && heap.get(right).compareTo(heap.get(smallest)) < 0) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    private void traverseUp(int index) {
        while (index > 0 && heap.get(parentOf(index)).compareTo(heap.get(index)) > 0) {
            swap(index, parentOf(index));
            index = parentOf(index);
        }
    }

    private int leftChildOf(int index) {
        return 2 * index + 1;
    }

    private int rightChildOf(int index) {
        return 2 * index + 2;
    }

    private int parentOf(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        K temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void printArr(){
        heap.printArr();
    }
}