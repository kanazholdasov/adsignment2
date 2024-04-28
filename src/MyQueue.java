public class MyQueue<T> extends MyLinkedList<T> {
    MyLinkedList<T> myLinkedList;

    public MyQueue(){
        myLinkedList = new MyLinkedList<>();
    }

    // add element to the end of the queue
    public void enqueue(T item){
        myLinkedList.addLast(item);
    }

    // get the element at the front of the queue
    public T peek(){
        return myLinkedList.getFirst();
    }

    // remove and return the element at the front of the queue
    public T dequeue(){
        T removingItem = peek();
        myLinkedList.removeFirst();
        return removingItem;
    }

    // return the size of queue
    public int size(){
        return myLinkedList.size();
    }

    // check if the queue is empty
    public boolean isEmpty(){
        return size() == 0;
    }
}