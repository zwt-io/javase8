package io.zwt.javase8;

import io.zwt.javase8.interfaces.SimplerInterface;

public class UseSimpleInterface {
    public static void main(String[] args) {

        SimplerInterface obj = () -> System.out.println("Say something");

        obj.doSomething();

    }
}
