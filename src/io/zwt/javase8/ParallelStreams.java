package io.zwt.javase8;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {

        System.out.println("Creating list");
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            strings.add("Item " + i);
        }

//        strings.stream()
//                .parallel()
//                .forEach(System.out::println);

        long count = strings.stream().parallel().count();
        System.out.println("Count: " + count);
    }
}
