public class MyMinHeap<K extends Comparable<K>>{
    private MyArrayList<K> heap;

    // Constructor
    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    // Check if the heap is empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // Get the size of the heap
    public int size() {
        return heap.size();
    }

    // Get the minimum element in the heap
    public K getMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap.get(0);
    }

    // Extract the minimum element from the heap
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

    // Insert an element into the heap
    public void insert(K item) {
        heap.add(item);
        traverseUp(heap.size() - 1);
    }

    // Restore the heap property starting from the given index
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

    // Move an element up in the heap until the heap property is satisfied
    private void traverseUp(int index) {
        while (index > 0 && heap.get(parentOf(index)).compareTo(heap.get(index)) > 0) {
            swap(index, parentOf(index));
            index = parentOf(index);
        }
    }

    // Get the index of the left child of the given index
    private int leftChildOf(int index) {
        return 2 * index + 1;
    }

    // Get the index of the right child of the given index
    private int rightChildOf(int index) {
        return 2 * index + 2;
    }

    // Get the index of the parent of the given index
    private int parentOf(int index) {
        return (index - 1) / 2;
    }

    // Swap two elements in the heap
    private void swap(int index1, int index2) {
        K temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    // Method to print the elements of the heap
    public void printArr(){
        heap.printArr();
    }
}
