package com.homework03;

import java.util.*;

/**
 * Created by Marina on 29.01.2019.
 */
public class Task03CompareCollections {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        List<String> linkedList = new LinkedList<String>();

        hashSet.add("pineapple");
        hashSet.add("watermelon");
        hashSet.add("apple");
        hashSet.add("pear");
        hashSet.add("quince");
        hashSet.add("lemon");
        hashSet.add("kiwi");

        linkedList.add("plum");
        linkedList.add("nut");
        linkedList.add("apple");
        linkedList.add("grape");
        linkedList.add("peach");
        linkedList.add("pear");
        linkedList.add("cherry");
        linkedList.add("orange");
        linkedList.add("watermelon");
        linkedList.add("apricot");
        linkedList.add("pineapple");

        Iterator<String> iteratorBeforeComparing = hashSet.iterator();

        System.out.println("Hashset before comparing: ");
        while (iteratorBeforeComparing.hasNext()){
            System.out.println(iteratorBeforeComparing.next());
        }

        hashSet.retainAll(linkedList);

        System.out.println("\n" + "LinkedList: ");
        for(int num=0; num<linkedList.size(); num++)
        {
            System.out.println(linkedList.get(num));
        }

        Iterator<String> iteratorAfterComparing = hashSet.iterator();
        System.out.println("\n" + "Hashset after comparing: ");
        while (iteratorAfterComparing.hasNext()){
            System.out.println(iteratorAfterComparing.next());
        }

    }
}
