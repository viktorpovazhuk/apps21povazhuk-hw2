package ua.edu.ucu.collections.immutable;

public final class ImmutableLinkedList implements ImmutableList {
    Node head, tail;

    public ImmutableLinkedList(Object[] elements) {
        head = new Node(elements[0]);
        Node prevNode = head, curNode;
        for (int i = 1; i < elements.length; i++) {
            curNode = new Node(prevNode, elements[i]);
            prevNode.setNext(curNode);
            prevNode = curNode;
        }
        tail = prevNode;
    }

    public ImmutableLinkedList() {
    }

    @Override
    public ImmutableList add(Object e) {

        return null;
    }

    @Override
    public ImmutableList add(int index, Object e) {
        return null;
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return null;
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public ImmutableList remove(int index) {
        return null;
    }

    @Override
    public ImmutableList set(int index, Object e) {
        return null;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public ImmutableList clear() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Object[] toArray() {
        int length = 0;
        Node curNode = head;
        while (curNode != null) {
            length++;
            curNode = curNode.getNext();
        }
        Object[] objects = new Object[length];
        int i = 0;
        curNode = head;
        while (curNode != null) {
            objects[i] = curNode.getValue();
            curNode = curNode.getNext();
            i++;
        }
        return objects;
    }

    public ImmutableLinkedList addFirst(Object e) {
        return null;
    }

    public ImmutableLinkedList addLast(Object e) {
        return null;
    }

    public Node getHead() {
        return null;
    }

    public Node getTail() {
        return null;
    }

    public Object getFirst() {
        return null;
    }

    public Object getLast() {
        return null;
    }

    public ImmutableLinkedList removeFirst() {
        return null;
    }

    public ImmutableLinkedList removeLast() {
        return null;
    }
}
