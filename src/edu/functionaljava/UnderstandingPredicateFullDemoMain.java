package edu.functionaljava;

import java.util.Scanner;
import java.util.function.Predicate;

public class UnderstandingPredicateFullDemoMain {
    public static void main(String[] args) {

        //UnderStanding predicate AND
        Predicate<Integer> num1 = x->x%2==0;
        Predicate<Integer> num2 = x-> x<10;
        Predicate<Integer> andDemo = num1.and(num2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is even and is less than 10: ");
        System.out.println(andDemo.test(sc.nextInt()));
        //System.out.println(num1.and(num2).test(sc.nextInt()));

        //Understanding Predicate OR
        Predicate<Integer> num3 = x->x%3==0;
        Predicate<Integer> num4 = x-> x<10;
        Predicate<Integer> orDemo = num3.or(num4);
        System.out.println("Enter a number to check whether it is even and is less than 10: ");
        System.out.println(orDemo.test(sc.nextInt()));
        //System.out.println(num1.and(num2).test(sc.nextInt()));

        //Understanding Predicate isEqual
        Predicate<String> isEqual = Predicate.isEqual("Soumyadeep");
        System.out.println("isEqual = " + isEqual.test("Babai"));
    }
}
