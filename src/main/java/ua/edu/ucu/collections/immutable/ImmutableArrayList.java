package ua.edu.ucu.collections.immutable;

import java.util.Arrays;
import java.util.Objects;

public final class ImmutableArrayList implements ImmutableList {
    private final Object[] list;

    public ImmutableArrayList(Object[] elements) {
        list = Arrays.copyOf(elements, elements.length);
    }

    public ImmutableArrayList() {
        list = new Object[0];
    }

    @Override
    public ImmutableList add(Object e) {
//        Object[] newObjectList = new Object[list.length+1];
//        System.arraycopy(list, 0, newObjectList, 0, list.length);
//        newObjectList[list.length] = e;
//        return new ImmutableArrayList(newObjectList);
        return add(list.length, e);
    }

    @Override
    public ImmutableList add(int index, Object e) {
        Object[] newObjectList = new Object[list.length+1];
        System.arraycopy(list, 0, newObjectList, 0, index);
        newObjectList[index] = e;
        System.arraycopy(list, index, newObjectList, index+1, list.length-index);
        return new ImmutableArrayList(newObjectList);
    }

    @Override
    public ImmutableList addAll(Object[] c) {
        return addAll(list.length, c);
    }

    @Override
    public ImmutableList addAll(int index, Object[] c) {
        Object[] newObjectList = new Object[list.length+c.length];
        System.arraycopy(list, 0, newObjectList, 0, index);
        System.arraycopy(c, 0, newObjectList, index, c.length);
        System.arraycopy(list, index, newObjectList, index+c.length, list.length-index);
        return new ImmutableArrayList(newObjectList);
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public ImmutableList remove(int index) {
        Object[] newObjectList = new Object[list.length-1];
        System.arraycopy(list, 0, newObjectList, 0, index);
        System.arraycopy(list, index+1, newObjectList, index, list.length-index-1);
        return new ImmutableArrayList(newObjectList);
    }

    @Override
    public ImmutableList set(int index, Object e) {
        Object[] newObjectList = Arrays.copyOf(list, list.length);
        newObjectList[index] = e;
        return new ImmutableArrayList(newObjectList);
    }

    @Override
    public int indexOf(Object e) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return list.length;
    }

    @Override
    public ImmutableList clear() {
        return new ImmutableArrayList();
    }

    @Override
    public boolean isEmpty() {
        return list.length == 0;
    }

    @Override
    public Object[] toArray() {
        return list;
    }

    @Override
    public String toString() {
        String prefix = "";
        StringBuilder res = new StringBuilder("[");
        for (Object obj: list) {
            res.append(prefix);
            prefix = ", ";
            res.append(obj.toString());
        }
        res.append("]");
        return res.toString();
    }
}
