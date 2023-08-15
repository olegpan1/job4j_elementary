package ru.job4j;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println("Hello world!");
        Map m = new HashMap(4, 10f);
        m.put(1, 1);
        Field tableField = HashMap.class.getDeclaredField("table");
        tableField.setAccessible(true);

        for (int i = 1; i < 50; i++) {
            Object[] table = (Object[]) tableField.get(m);
            System.out.println("Capacity: ");
            System.out.println(table == null ? 0 : table.length);
            System.out.println("Size: ");
            System.out.println(m.size());
            m.put(i, i);
        }
        Object[] table = (Object[]) tableField.get(m);
        System.out.println("Capacity: ");
        System.out.println(table == null ? 0 : table.length);

        System.out.println(m.size());
        System.out.println(m.values());

    }
}