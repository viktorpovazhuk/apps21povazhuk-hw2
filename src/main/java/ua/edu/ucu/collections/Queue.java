package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList linkedList;

    public Queue() {
        linkedList = new ImmutableLinkedList();
    }

    public Object peek() {
        return linkedList.getFirst();
    }

    public Object dequeue() {
        Object firstObject = peek();
        linkedList = linkedList.removeFirst();
        return firstObject;
    }

    public void enqueue(Object e) {
        linkedList = linkedList.addLast(e);
    }
}
