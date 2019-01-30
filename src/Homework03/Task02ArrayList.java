package Homework03;

import java.util.*;

/**
 * Created by Marina on 29.01.2019.
 */
public class Task02ArrayList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();

        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");

        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
