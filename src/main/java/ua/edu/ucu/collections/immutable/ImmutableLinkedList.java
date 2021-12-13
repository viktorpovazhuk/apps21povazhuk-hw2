package ua.edu.ucu.collections.immutable;

public final class ImmutableLinkedList implements ImmutableList {
    private Node head, tail;

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
        return addAll(new Object[]{e});
    }

    @Override
    public ImmutableList add(int index, Object e) {
        return addAll(index, new Object[]{e});
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return addAll(size(), c);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        Object[] arr = toArray();
        Object[] newArr = new Object[arr.length + c.length];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(c, 0, newArr, index, c.length);
        System.arraycopy(arr, index, newArr, index + c.length, arr.length - index);
        return new ImmutableLinkedList(newArr);
    }

    @Override
    public Object get(int index) {
        Object[] arr = toArray();
        return arr[index];
    }

    @Override
    public ImmutableList remove(int index) {
        Object[] arr = toArray();
        Object[] newArr = new Object[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1);
        return new ImmutableLinkedList(newArr);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        Object[] arr = toArray();
        arr[index] = e;
        return new ImmutableLinkedList(arr);
    }

    @Override
    public int indexOf(Object e) {
        Object[] arr = toArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return toArray().length;
    }

    @Override
    public ImmutableList clear() {
        return new ImmutableLinkedList();
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
        return (ImmutableLinkedList) add(0, e);
    }

    public ImmutableLinkedList addLast(Object e) {
        return (ImmutableLinkedList) add(size(), e);
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public Object getFirst() {
        return getHead().getValue();
    }

    public Object getLast() {
        return getTail().getValue();
    }

    public ImmutableLinkedList removeFirst() {
//        Object[] arr = toArray();
//        Object[] newArr = new Object[arr.length-1];
//        System.arraycopy(arr, 1, newArr, 0, arr.length-1);
//        return new ImmutableLinkedList(newArr);
        return (ImmutableLinkedList) remove(0);
    }

    public ImmutableLinkedList removeLast() {
//        Object[] arr = toArray();
//        Object[] newArr = new Object[arr.length-1];
//        System.arraycopy(arr, 0, newArr, 0, arr.length-1);
//        return new ImmutableLinkedList(newArr);
        return (ImmutableLinkedList) remove(size() - 1);
    }
}
