public class MyStack<K> {
    MyArrayList<K> arrayList;

    public MyStack(){
        arrayList = new MyArrayList<K>();
    }

    public void push(K item){
        arrayList.addFirst(item);
    }

    public K peek(){
        return arrayList.getFirst();
    }

    public K pop(){
        K removingItem = peek();
        arrayList.removeFirst();
        return removingItem;
    }

    public int size(){
        return arrayList.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }
}