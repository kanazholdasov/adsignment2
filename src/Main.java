import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Object> myList = new MyArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grape");
        myList.add("Kiwi");

        System.out.println("Original ArrayList:");
        myList.printArr();

        System.out.println("Testing other methods:");

        System.out.println("\nAdding 'Mango' at index 2:");
        myList.add(2, "Mango");
        myList.printArr();

        System.out.println("Adding 'Pineapple' at the beginning:");
        myList.addFirst("Pineapple");
        myList.printArr();

        System.out.println("Adding 'Watermelon' at the end:");
        myList.addLast("Watermelon");
        myList.printArr();

        System.out.println("Setting element at index 3 to 'Cherry':");
        myList.set(3, "Cherry");
        myList.printArr();

        System.out.println("Getting element at index 4: " + myList.get(4));

        System.out.println("\nGetting the first element: " + myList.getFirst());

        System.out.println("\nGetting the last element: " + myList.getLast());

        System.out.println("\nRemoving element at index 1:");
        myList.remove(1);
        myList.printArr();

        System.out.println("Removing first element:");
        myList.removeFirst();
        myList.printArr();

        System.out.println("Removing last element:");
        myList.removeLast();
        myList.printArr();

        System.out.println("Index of 'Banana': " + myList.lastIndexOf("Banana"));

        System.out.println("\nDoes 'Grape' exist in the list? " + myList.exists("Grape"));

        System.out.println("\nSorting list:");
        myList.sort();
        myList.printArr();

        System.out.println("Converting list to array:");
        Object[] array = myList.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nClearing the list:");
        myList.clear();
        myList.printArr();

        myList.add("Strawberry");
        myList.add("Blueberry");
        myList.add("Raspberry");
        myList.add("Blackberry");
        myList.add("Cranberry");

        System.out.println("List after adding elements again:");
        myList.printArr();

        System.out.println("Testing iterator:");
        System.out.println("Iterating over the list:");
        Iterator<Object> iter = myList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        MyLinkedList<Object> myListLinked = new MyLinkedList<>();

        myListLinked.add("Apple");
        myListLinked.add("Banana");
        myListLinked.add("Orange");
        myListLinked.add("Grape");
        myListLinked.add("Kiwi");

        System.out.println("\n\n\nTesting MyLinkedList:");
        System.out.println("Original LinkedList:");
        myListLinked.printArr();

        System.out.println("\nTesting other methods:");

        System.out.println("\nAdding 'Mango' at index 2:");
        myListLinked.add(2, "Mango");
        myListLinked.printArr();

        System.out.println("Adding 'Pineapple' at the beginning:");
        myListLinked.addFirst("Pineapple");
        myListLinked.printArr();

        System.out.println("Adding 'Watermelon' at the end:");
        myListLinked.addLast("Watermelon");
        myListLinked.printArr();

        System.out.println("Setting element at index 3 to 'Cherry':");
        myListLinked.set(3, "Cherry");
        myListLinked.printArr();

        System.out.println("Getting element at index 4: " + myListLinked.get(4));

        System.out.println("\nGetting the first element: " + myListLinked.getFirst());

        System.out.println("\nGetting the last element: " + myListLinked.getLast());

        System.out.println("\nRemoving element at index 1:");
        myListLinked.remove(1);
        myListLinked.printArr();

        System.out.println("Removing first element:");
        myListLinked.removeFirst();
        myListLinked.printArr();

        System.out.println("Removing last element:");
        myListLinked.removeLast();
        myListLinked.printArr();

        System.out.println("Index of 'Banana': " + myListLinked.lastIndexOf("Banana"));

        System.out.println("\nDoes 'Grape' exist in the list? " + myListLinked.exists("Grape"));

        System.out.println("\nSorting list");
        myListLinked.sort();
        myListLinked.printArr();

        System.out.println("Converting list to array:");
        Object[] arrayLinked = myListLinked.toArray();
        for (int i = 0; i < arrayLinked.length; i++) {
            System.out.print(arrayLinked[i] + " ");
        }

        System.out.println("\nClearing the list:");
        myListLinked.clear();
        myListLinked.printArr();

        myListLinked.add("Strawberry");
        myListLinked.add("Blueberry");
        myListLinked.add("Raspberry");
        myListLinked.add("Blackberry");
        myListLinked.add("Cranberry");

        System.out.println("\nList after adding elements again:");
        myListLinked.printArr();

        System.out.println("Testing iterator:");
        System.out.println("Iterating over the list:");
        Iterator<Object> iterLinked = myListLinked.iterator();
        while (iterLinked.hasNext()) {
            System.out.print(iterLinked.next() + " ");
        }
        System.out.println(" ");
        MyStack<Object> stack = new MyStack<>();

        System.out.println("\nIs stack empty? " + stack.isEmpty()); // Output: true

        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Top element of the stack: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Size of the stack: " + stack.size());

        System.out.println("Is stack empty? " + stack.isEmpty());


        MyQueue<Object> queue = new MyQueue<>();

        System.out.println("\nIs queue empty? " + queue.isEmpty());

        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Front element of the queue: " + queue.peek());

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        System.out.println("Size of the queue: " + queue.size());

        System.out.println("Is queue empty? " + queue.isEmpty());

        MyMinHeap<Integer> minHeap = new MyMinHeap<>();

        System.out.println("\nIs heap empty? " + minHeap.isEmpty());

        System.out.println("Adding elements...");
        minHeap.insert(4);
        minHeap.insert(2);
        minHeap.insert(7);
        System.out.println("After adding 4, 2, 7: ");
        minHeap.printArr();
        minHeap.insert(1);
        minHeap.insert(8);
        System.out.println("After adding 1, 8: ");
        minHeap.printArr();

        System.out.println("Minimum element in the heap: " + minHeap.getMin());

        System.out.println("Minimum element removed: " + minHeap.extractMin());
        minHeap.printArr();

        System.out.println("Minimum element in the heap: " + minHeap.getMin());

        System.out.println("Size of the heap: " + minHeap.size());

        System.out.println("Is heap empty? " + minHeap.isEmpty());
    }
}
