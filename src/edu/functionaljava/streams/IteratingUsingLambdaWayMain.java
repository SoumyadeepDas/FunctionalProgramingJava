package edu.functionaljava.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class IteratingUsingLambdaWayMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Consumer<String> consumer = System.out::println;

        examine(list, consumer);
        System.out.println();
        examine(list, System.out::println);// can be done in this way too.

    }

    public static void examine(List<String> list, Consumer<String> operation) {
        for (String element : list) {
            operation.accept(element);
        }
    }

}
