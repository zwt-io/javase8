package io.zwt.javase8;

import io.zwt.javase8.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SumAndAverage {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Joe", 48));
        people.add(new Person("Mary", 30));
        people.add(new Person("Mike", 73));

        int sum = people.stream()
                .mapToInt(Person::getAge)
                .sum();
        System.out.println("Total of ages: " + sum);

        OptionalDouble avg = people.stream()
                .mapToInt(Person::getAge)
                .average();

        if (avg.isPresent()) {
            System.out.println("Average: " + avg.getAsDouble());
        } else {
            System.out.println("Average not calculated");
        }


    }
}
