package edu.functionaljava;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnderstandingOperatorInterfaceDemoMain {
    public static void main(String[] args) {
        UnaryOperator<Integer> incrementBy2 = x -> x+2;
        System.out.println(incrementBy2.apply(2));

        BinaryOperator<Integer> getSum = (x,y)->x+y;
        System.out.println(getSum.apply(5,6));

        //public interface BinaryOperator<T> extends BiFunction<T,T,T>, the operators extend function,
        //you should use BiFunction as Binary operator reference can be put into BinaryFunction
        //Example:

        BiFunction<Integer,Integer,Integer> puttingBinaryOperatorInBiFunction = getSum;
        System.out.println(puttingBinaryOperatorInBiFunction.apply(10,10));
        //Other way around is not possible.


    }
}
