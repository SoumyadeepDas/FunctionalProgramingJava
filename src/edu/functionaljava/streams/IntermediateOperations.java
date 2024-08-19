package edu.functionaljava.streams;

import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> limitedStream = numbers.limit(5);
        Stream<Integer> superLimitedStream = limitedStream.limit(3);
        superLimitedStream.forEach(System.out::println);

        System.out.println("Printing only the even numbers using filter: ");
        Stream<Integer> numbers2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> evenStream = numbers2.filter(number -> number % 2 == 0);
        evenStream.forEach(System.out::println);

        //Using the fluent API:
        System.out.println("Printing only even numbers using fluent API: ");
        Stream.of(1,2,3,4,5,6,7,8,9,10).filter(number -> number%2 == 0).forEach(System.out::println);

        //Using the Map Operator: (Map takes in a Function) here I am using method reference
        Stream<String> names = Stream.of("John", "Jane", "Jack", "Bob");
        names.map(String::toUpperCase).forEach(System.out::println);
        System.out.println();
        System.out.println();
        //Using the peek and debugging operator:
        Stream<String> names2 = Stream.of("apple","banana","mango","strawberry");
        names2
                .map(String::toUpperCase)
                .peek(str -> System.out.println("Peek result = "+str))
                .filter(name -> name.length()<6)
                .forEach(System.out::println);

        //Understanding the lazy approach
        //Let's suppose I remove the terminal operation of forEach
        /*Stream<String> names3 =
        names2
                .map(String::toUpperCase)
                .peek(str -> System.out.println("Peek result = "+str)) // the peek will not work as it's a lazy approach.
                // They work if and only if somebody is there to consume the stream. These are just intermediate worker,
                // they won't finalise the thing. The stream won't even start if it doesn't find any terminal operation.
                .filter(name -> name.length()<6);*/

        //Using the distinct() operator & sorted():

        numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5 , 6);
        numbers.distinct().sorted().forEach(System.out::println);

        //Concatenating 2 streams:

        Stream<Integer> oddNumbers = Stream.of(1,3,5,7,9);
        Stream<Integer> evenNumbers = Stream.of(0,2,4,6,8);
        System.out.println("Testing the concat operator: ");
        Stream.concat(oddNumbers, evenNumbers).forEach(System.out::println);
    }
}
