package ua.edu.ucu.collections.immutable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ImmutableLinkedListTest {
    private Object[] secObjList;
    private ImmutableLinkedList immutableLinkList, changedLinkList;

    @Test
    public void add() {
        assertArrayEquals(new Object[]{1, 2, 3}, immutableLinkList.add(3).toArray());
    }

    @Test
    public void addAll() {
        assertArrayEquals(new Object[]{1, 2, 1, 2}, immutableLinkList.addAll(new Object[]{1, 2}).toArray());
    }

    @Test
    public void get() {
        assertEquals(2, immutableLinkList.get(1));
    }

    @Test
    public void remove() {
        assertArrayEquals(new Object[]{2}, immutableLinkList.remove(0).toArray());
    }

    @Test
    public void set() {
        assertArrayEquals(new Object[]{1, 4}, immutableLinkList.set(1, 4).toArray());
    }

    @Test
    public void indexOf() {
        assertEquals(1, immutableLinkList.indexOf(2));
    }

    @Test
    public void size() {
        assertEquals(2, immutableLinkList.size());
    }

    @Test
    public void isEmpty() {
        changedLinkList = new ImmutableLinkedList();
        assertTrue(changedLinkList.isEmpty());
    }

    @Test
    public void toArray() {
        assertArrayEquals(new Object[]{1, 2}, immutableLinkList.toArray());
    }

    @Test
    public void addFirst() {
        assertArrayEquals(new Object[]{0, 1, 2}, immutableLinkList.addFirst(0).toArray());
    }

    @Test
    public void addLast() {
        assertArrayEquals(new Object[]{1, 2, 0}, immutableLinkList.addLast(0).toArray());
    }

    @Test
    public void getHead() throws Exception {
        assertEquals(1, immutableLinkList.getHead().getValue());
    }

    @Test
    public void getTail() {
        assertEquals(2, immutableLinkList.getTail().getValue());
    }

    @Test
    public void getFirst() {
        assertEquals(1, immutableLinkList.getFirst());
    }

    @Test
    public void getLast() {
        assertEquals(2, immutableLinkList.getLast());
    }

    @Test
    public void removeFirst() {
        assertArrayEquals(new Object[]{2}, immutableLinkList.removeFirst().toArray());
    }

    @Test
    public void removeLast() {
        assertArrayEquals(new Object[]{1}, immutableLinkList.removeLast().toArray());
    }

    @Before
    public void setUp() throws Exception {
        Object[] objectList = new Object[2];
        objectList[0] = 1;
        objectList[1] = 2;
        immutableLinkList = new ImmutableLinkedList(objectList);
        secObjList = Arrays.copyOf(objectList, objectList.length);
    }

    @After
    public void tearDown() throws Exception {
    }
}