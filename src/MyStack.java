// MyStack class represents a stack data structure implemented using an ArrayList
public class MyStack<K> {
    MyArrayList<K> arrayList; // ArrayList to store the elements of the stack

    // Constructor to initialize the ArrayList
    public MyStack(){
        arrayList = new MyArrayList<K>();
    }

    // Method to push an element onto the stack
    public void push(K item){
        arrayList.addFirst(item);
    }

    // Method to get the element at the top of the stack without removing it
    public K peek(){
        return arrayList.getFirst();
    }

    // Method to pop and return the element at the top of the stack
    public K pop(){
        K removingItem = peek(); // Get the element at the top of the stack
        arrayList.removeFirst(); // Remove the element from the top of the stack
        return removingItem; // Return the removed element
    }

    // Method to return the size of the stack
    public int size(){
        return arrayList.size();
    }

    // Method to check if the stack is empty
    public boolean isEmpty(){
        return size() == 0;
    }
}
