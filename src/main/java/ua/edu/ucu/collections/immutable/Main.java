package ua.edu.ucu.collections.immutable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] objectList = new Object[2];
        objectList[0] = 1;
        objectList[1] = 2;
        ImmutableList immutableArrList = new ImmutableArrayList(objectList);
        ImmutableList changedArrList = immutableArrList.add(4);
        System.out.println(changedArrList);

        Object[] secObjList = Arrays.copyOf(objectList, objectList.length);
        changedArrList = changedArrList.addAll(2, secObjList);
        System.out.println(changedArrList);

        changedArrList = changedArrList.remove(1);
        System.out.println(changedArrList);

        changedArrList = changedArrList.set(2, 3);
        System.out.println(changedArrList);

        System.out.println(changedArrList.indexOf(4));


    }
}
