package edu.functionaljava;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ComposableFunctions {
    public static void main(String[] args) {
        UnaryOperator<Integer> increment = x->x+1;
        UnaryOperator<Integer> doubleIt = x->x*2;

        Function<Integer, Integer> combine = increment.andThen(doubleIt);

        System.out.println("Enter a number of first increment and then double it. ");

        System.out.println(combine.apply(new Scanner(System.in).nextInt()));

        //Function<String,String> trimSpaces = str -> str.trim();

        Function<String,String> trimSpaces = String::trim;
    }
}
