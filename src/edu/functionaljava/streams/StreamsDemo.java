package edu.functionaljava.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Streams are immutable. Collections are mutable (in place transformation happens)
public class StreamsDemo {
    public static void main(String[] args) throws IOException {
        //Creating streams from List:
        List<String> names = List.of("John", "Jane", "Bob", "Jack");
        Stream<String> stream = names.stream(); // getting a stream from the collection.
        stream.forEach(System.out::println);

        //Creating streams from Set:
        Set<String> names2 = Set.of("John", "Jane", "Bob", "Jack");
        Stream<String> stream2 = names2.stream();
        stream2.forEach(System.out::println);

        //Creating streams from Arrays:
        int[] numbers = {1,2,3,4,5};
        IntStream stream3 = Arrays.stream(numbers);
        /*IntStream is a specialized stream in Java that is part of the java.util.stream package. It is designed
         specifically for working with sequences of int values, offering a set of operations that can be applied to
         these sequences in a functional and efficient way.
        	•	Primitive Type Stream: Unlike a regular Stream<T> which works with reference types (e.g., Stream<Integer>),
                IntStream is designed for the primitive int type. This helps avoid the overhead of boxing and unboxing
                (i.e., converting between int and Integer), leading to better performance when working with large sequences
                of integers.
	        •	Functional Operations: IntStream provides a variety of operations that can be used to process sequences of
	            int values. These include common operations like map, filter, reduce, sum, average, and more.
	        •	Laziness: Like all streams, IntStream operations are lazy. This means that intermediate operations
	            (like map or filter) are not executed until a terminal operation (like sum or forEach) is invoked. */
        stream3.forEach(System.out::println);

        //Using Stream.of
        Stream.of("mango","banana","strawberry").forEach(System.out::println);

        //Streams are collection agnostic. A stream is a different kind of data structure whose work is to process element
        //It is different from the data structure whose element it is processing. It doesn't depend on the data structure
        //whose element it is processing.

        //Getting the contents of a file as stream. (Using built in NIO API)
        System.out.println("Reading a file and converting it to a stream" );
        Stream<String> lines = Files.lines(Paths.get("README.md"));
        lines.forEach(System.out::println);

        //It accepts a supplier, it invokes a supplier get the return and process it as a stream. But we need to limit it
        //otherwise it will create an infinite stream.
        //Printing 10 random doubles:
        System.out.println("Printing 10 random doubles: ");
        Stream.generate(new Random()::nextDouble).limit(10).forEach(System.out::println);
        //Takes a starting value and a unary operator, uses the starting value to operate on the unary operator.
        System.out.println("Printing the first 10 even numbers starting from 0: ");
        Stream.iterate(0,x->x+2).limit(10).forEach(System.out::println);
        
        //Converting a stream to a collection (List in this case):
        List<Integer> upTo9 = Stream.iterate(0,x->x+1).limit(10).toList();
        System.out.println("upTo99 = " + upTo9);
    }
}
