package io.zwt.javase8;

import java.util.*;

public class UseComparator {
    public static void main(String[] args) {

        String[] strArray = {"AAA", "bbb", "CCC", "ddd", "EEE"};
        List<String> strings = new ArrayList<>(Arrays.asList(strArray));

        //Simple case-sensitive sort operation
        Collections.sort(strings);
        System.out.println("Simple sort");
        for (String str : strings) {
            System.out.println(str);
        }

        //Case-insensitive sort with an anonymous class
        strings.sort(String::compareToIgnoreCase);
        System.out.println("Sort with comparator");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
