public class Main {
    public static void main(String[] args) {
        // Testing MyArrayList
        System.out.println("Testing MyArrayList:");
        MyList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("ArrayList elements:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        // Testing MyLinkedList
        System.out.println("\nTesting MyLinkedList:");
        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Size of LinkedList: " + linkedList.size());
        System.out.println("LinkedList elements:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();

        // Testing MyStack
        System.out.println("\nTesting MyStack:");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Size of Stack: " + stack.size());
        System.out.println("Stack elements:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        // Testing MyQueue
        System.out.println("\nTesting MyQueue:");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Size of Queue: " + queue.size());
        System.out.println("Queue elements:");
        while (queue.size() > 0) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();

    }
}
