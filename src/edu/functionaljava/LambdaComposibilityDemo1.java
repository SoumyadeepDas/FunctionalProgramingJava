package edu.functionaljava;

import java.time.LocalDateTime;
import java.util.function.UnaryOperator;

public class LambdaComposibilityDemo1 {
    public static void operationLogger(UnaryOperator<Integer> operator){
        System.out.println("Start :"+ LocalDateTime.now());
        System.out.println(operator.apply(10));
        System.out.println("End :"+LocalDateTime.now());
    }

    public static void main(String[] args) {
        UnaryOperator<Integer> increment = x -> x+1;
        operationLogger(increment);
    }
}
