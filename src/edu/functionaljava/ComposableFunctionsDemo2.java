package edu.functionaljava;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ComposableFunctionsDemo2 {
    public static void main(String[] args) {

        System.out.println("Enter a string to remove all leading and trailing spaces and convert it to UpperCase: ");

        //Function<String,String> trimSpaces = str -> str.trim();
        //Function<String, String> upperCase = str -> str.toUpperCase();
//        Function <String,String> trimSpaces = String::trim;
//        Function <String,String> upperCase = String::toUpperCase;
//
//        String getName = trimSpaces.andThen(upperCase).apply("  djhfjhdsj  ajshdjh  ");
//
//        System.out.println(getName);

        UnaryOperator<String> trim = (String::trim);
        System.out.println(trim.andThen(String::toUpperCase).apply(new Scanner(System.in).nextLine()));

    }
}