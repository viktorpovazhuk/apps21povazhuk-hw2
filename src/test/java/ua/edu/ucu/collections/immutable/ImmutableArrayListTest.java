package ua.edu.ucu.collections.immutable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {

    private Object[] secObjList;
    private ImmutableList immutableArrList, changedArrList;

    @Before
    public void setUp() throws Exception {
        Object[] objectList = new Object[2];
        objectList[0] = 1;
        objectList[1] = 2;
        immutableArrList = new ImmutableArrayList(objectList);
        secObjList = Arrays.copyOf(objectList, objectList.length);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        changedArrList = immutableArrList.add(4);
        assertArrayEquals(changedArrList.toArray(), new Object[]{1, 2, 4});
    }

    @Test
    public void addAll() {
        changedArrList = immutableArrList.addAll(2, secObjList);
        assertArrayEquals(changedArrList.toArray(), new Object[]{1, 2, 1, 2});
    }

    @Test
    public void get() {
        assertEquals(immutableArrList.get(0), 1);
    }

    @Test
    public void remove() {
        assertArrayEquals(immutableArrList.remove(0).toArray(), new Object[]{2});
    }

    @Test
    public void set() {
        assertArrayEquals(immutableArrList.set(0, 2).toArray(), new Object[]{2, 2});
    }

    @Test
    public void indexOf() {
        assertEquals(immutableArrList.indexOf(2), 1);
    }

    @Test
    public void clear() {
        assertArrayEquals(immutableArrList.clear().toArray(), new Object[]{});
    }

    @Test
    public void toArray() {
        assertArrayEquals(immutableArrList.toArray(), new Object[]{1, 2});
    }
}