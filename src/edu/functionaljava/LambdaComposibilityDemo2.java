package edu.functionaljava;


import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.UnaryOperator;

public class LambdaComposibilityDemo2 {

    public static void main(String[] args) {
        System.out.println("Enter a number to increment by 1: ");

        BiConsumer<UnaryOperator<Integer>,Integer> logger = (operation, number)->{
            System.out.println("Start :"+ LocalDateTime.now());
            System.out.println(operation.apply(number));
            System.out.println("End :"+LocalDateTime.now());
        };

        logger.accept(x->x+1,new Scanner(System.in).nextInt());
    }
}

