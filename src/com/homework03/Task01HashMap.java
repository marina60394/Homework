package com.homework03;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marina on 29.01.2019.
 */
public class Task01HashMap {
    public static void main(String[] args) {
        Map<String, Object> hashMap  = new HashMap<String, Object>();

        hashMap.put("Test", 7);
        hashMap.put("Class", 4.5);
        hashMap.put("Cat", true);
        hashMap.put("Dog", null);
        hashMap.put("Bird", "Cat");
        hashMap.put("Something", new Long(83));
        hashMap.put("Mail", new Character('8'));
        hashMap.put("Tab", '2');
        hashMap.put("Browser", 22222222222L);
        hashMap.put("IDE", (double) 489);

        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
