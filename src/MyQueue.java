// MyQueue class represents a queue data structure implemented using a linked list
public class MyQueue<T>  {
    MyLinkedList<T> myLinkedList; // Linked list to store the elements of the queue

    // Constructor to initialize the linked list
    public MyQueue(){
        myLinkedList = new MyLinkedList<>();
    }

    // Method to add an element to the end of the queue
    public void enqueue(T item){
        myLinkedList.addLast(item);
    }

    // Method to get the element at the front of the queue
    public T peek(){
        return myLinkedList.getFirst();
    }

    // Method to remove and return the element at the front of the queue
    public T dequeue(){
        T removingItem = peek(); // Get the element at the front of the queue
        myLinkedList.removeFirst(); // Remove the element from the front of the queue
        return removingItem; // Return the removed element
    }

    // Method to return the size of the queue
    public int size(){
        return myLinkedList.size();
    }

    // Method to check if the queue is empty
    public boolean isEmpty(){
        return size() == 0;
    }
} 
