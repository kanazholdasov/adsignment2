import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of MyArrayList
        MyArrayList<Object> myList = new MyArrayList<>();

        // Adding elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grape");
        myList.add("Kiwi");

        // Printing the original ArrayList
        System.out.println("Original ArrayList:");
        myList.printArr();

        // Testing other methods

        // Adding 'Mango' at index 2
        System.out.println("\nAdding 'Mango' at index 2:");
        myList.add(2, "Mango");
        myList.printArr();

        // Adding 'Pineapple' at the beginning
        System.out.println("Adding 'Pineapple' at the beginning:");
        myList.addFirst("Pineapple");
        myList.printArr();

        // Adding 'Watermelon' at the end
        System.out.println("Adding 'Watermelon' at the end:");
        myList.addLast("Watermelon");
        myList.printArr();

        // Setting element at index 3 to 'Cherry'
        System.out.println("Setting element at index 3 to 'Cherry':");
        myList.set(3, "Cherry");
        myList.printArr();

        // Getting element at index 4
        System.out.println("Getting element at index 4: " + myList.get(4));

        // Getting the first element
        System.out.println("\nGetting the first element: " + myList.getFirst());

        // Getting the last element
        System.out.println("\nGetting the last element: " + myList.getLast());

        // Removing element at index 1
        System.out.println("\nRemoving element at index 1:");
        myList.remove(1);
        myList.printArr();

        // Removing first element
        System.out.println("Removing first element:");
        myList.removeFirst();
        myList.printArr();

        // Removing last element
        System.out.println("Removing last element:");
        myList.removeLast();
        myList.printArr();

        // Index of 'Banana'
        System.out.println("Index of 'Banana': " + myList.lastIndexOf("Banana"));

        // Checking if 'Grape' exists in the list
        System.out.println("\nDoes 'Grape' exist in the list? " + myList.exists("Grape"));

        // Sorting list
        System.out.println("\nSorting list:");
        myList.sort();
        myList.printArr();

        // Converting list to array
        System.out.println("Converting list to array:");
        Object[] array = myList.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Clearing the list
        System.out.println("\nClearing the list:");
        myList.clear();
        myList.printArr();

        // Adding elements again after clearing the list
        myList.add("Strawberry");
        myList.add("Blueberry");
        myList.add("Raspberry");
        myList.add("Blackberry");
        myList.add("Cranberry");

        // Printing the list after adding elements again
        System.out.println("\nList after adding elements again:");
        myList.printArr();

        // Testing iterator
        System.out.println("Testing iterator:");
        System.out.println("Iterating over the list:");
        Iterator<Object> iter = myList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        // Creating an instance of MyLinkedList
        MyLinkedList<Object> myListLinked = new MyLinkedList<>();

        // Adding elements to the linked list
        myListLinked.add("Apple");
        myListLinked.add("Banana");
        myListLinked.add("Orange");
        myListLinked.add("Grape");
        myListLinked.add("Kiwi");

        // Printing the original LinkedList
        System.out.println("\n\n\nTesting MyLinkedList:");
        System.out.println("Original LinkedList:");
        myListLinked.printArr();

        // Testing other methods

        // Adding 'Mango' at index 2
        System.out.println("\nTesting other methods:");
        System.out.println("\nAdding 'Mango' at index 2:");
        myListLinked.add(2, "Mango");
        myListLinked.printArr();

        // Adding 'Pineapple' at the beginning
        System.out.println("Adding 'Pineapple' at the beginning:");
        myListLinked.addFirst("Pineapple");
        myListLinked.printArr();

        // Adding 'Watermelon' at the end
        System.out.println("Adding 'Watermelon' at the end:");
        myListLinked.addLast("Watermelon");
        myListLinked.printArr();

        // Setting element at index 3 to 'Cherry'
        System.out.println("Setting element at index 3 to 'Cherry':");
        myListLinked.set(3, "Cherry");
        myListLinked.printArr();

        // Getting element at index 4
        System.out.println("Getting element at index 4: " + myListLinked.get(4));

        // Getting the first element
        System.out.println("\nGetting the first element: " + myListLinked.getFirst());

        // Getting the last element
        System.out.println("\nGetting the last element: " + myListLinked.getLast());

        // Removing element at index 1
        System.out.println("\nRemoving element at index 1:");
        myListLinked.remove(1);
        myListLinked.printArr();

        // Removing first element
        System.out.println("Removing first element:");
        myListLinked.removeFirst();
        myListLinked.printArr();

        // Removing last element
        System.out.println("Removing last element:");
        myListLinked.removeLast();
        myListLinked.printArr();

        // Index of 'Banana'
        System.out.println("Index of 'Banana': " + myListLinked.lastIndexOf("Banana"));

        // Checking if 'Grape' exists in the list
        System.out.println("\nDoes 'Grape' exist in the list? " + myListLinked.exists("Grape"));

        // Sorting list
        System.out.println("\nSorting list");
        myListLinked.sort();
        myListLinked.printArr();

        // Converting list to array
        System.out.println("Converting list to array:");
        Object[] arrayLinked = myListLinked.toArray();
        for (int i = 0; i < arrayLinked.length; i++) {
            System.out.print(arrayLinked[i] + " ");
        }

        // Clearing the list
        System.out.println("\nClearing the list:");
        myListLinked.clear();
        myListLinked.printArr();

        // Adding elements again after clearing the list
        myListLinked.add("Strawberry");
        myListLinked.add("Blueberry");
        myListLinked.add("Raspberry");
        myListLinked.add("Blackberry");
        myListLinked.add("Cranberry");

        // Printing the list after adding elements again
        System.out.println("\nList after adding elements again:");
        myListLinked.printArr();

        // Testing iterator
        System.out.println("Testing iterator:");
        System.out.println("Iterating over the list:");
        Iterator<Object> iterLinked = myListLinked.iterator();
        while (iterLinked.hasNext()) {
            System.out.print(iterLinked.next() + " ");
        }

        // Creating an instance of MyStack
        MyStack<Object> stack = new MyStack<>();

        // Checking if the stack is empty
        System.out.println("\n\nIs stack empty? " + stack.isEmpty()); // Output: true

        // Pushing elements onto the stack
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Printing the top element of the stack
        System.out.println("Top element of the stack: " + stack.peek());

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Printing the size of the stack
        System.out.println("Size of the stack: " + stack.size());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());


        // Creating an instance of MyQueue
        MyQueue<Object> queue = new MyQueue<>();

        // Checking if the queue is empty
        System.out.println("\nIs queue empty? " + queue.isEmpty());

        // Enqueuing elements into the queue
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // Printing the front element of the queue
        System.out.println("Front element of the queue: " + queue.peek());

        // Dequeuing elements from the queue
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Printing the size of the queue
        System.out.println("Size of the queue: " + queue.size());

        // Checking if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Creating an instance of MyMinHeap
        MyMinHeap<Integer> minHeap = new MyMinHeap<>();

        // Checking if the heap is empty
        System.out.println("\nIs heap empty? " + minHeap.isEmpty());

        // Adding elements to the heap
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

        // Getting the minimum element in the heap
        System.out.println("Minimum element in the heap: " + minHeap.getMin());

        // Removing the minimum element from the heap
        System.out.println("Minimum element removed: " + minHeap.extractMin());
        minHeap.printArr();

        // Getting the minimum element in the heap
        System.out.println("Minimum element in the heap: " + minHeap.getMin());

        // Printing the size of the heap
        System.out.println("Size of the heap: " + minHeap.size());

        // Checking if the heap is empty
        System.out.println("Is heap empty? " + minHeap.isEmpty());
    }
}
