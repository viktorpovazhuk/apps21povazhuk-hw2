package ua.edu.ucu.collections.immutable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {
    private Object[] secObjList;
    private ImmutableList immutableLinkList, changedLinkList;

    @Test
    public void add() {

    }

    @Test
    public void addAll() {
    }

    @Test
    public void get() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void set() {
    }

    @Test
    public void indexOf() {
    }

    @Test
    public void size() {
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
    }

    @Test
    public void addLast() {
    }

    @Test
    public void getHead() {
    }

    @Test
    public void getTail() {
    }

    @Test
    public void getFirst() {
    }

    @Test
    public void getLast() {
    }

    @Test
    public void removeFirst() {
    }

    @Test
    public void removeLast() {
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