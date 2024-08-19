package edu.functionaljava;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.UnaryOperator;

public class LambdaComposibilityDemo3 {

    public static void main(String[] args) {
        System.out.println("Enter a number to increment by 1: ");

        Runnable logStart = () -> System.out.println("Start: "+LocalDateTime.now());
        Runnable logEnd = ()-> System.out.println("End: "+LocalDateTime.now());

        BiConsumer<UnaryOperator<Integer>,Integer> logger = (operation, number)->{
            logStart.run();
            System.out.println(operation.apply(number));
            logEnd.run();
        };

        logger.accept(x->x+1,new Scanner(System.in).nextInt());
    }
}