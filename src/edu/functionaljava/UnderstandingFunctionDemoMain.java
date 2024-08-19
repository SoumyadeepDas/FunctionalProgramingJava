package edu.functionaljava;

import java.util.function.Function;

public class UnderstandingFunctionDemoMain {
    public static void main(String[] args) {
        Function<Integer,Integer> multiply2 = x -> x*2;
        Function<Integer,Integer> cube = x -> (int) Math.pow(x,3);

        System.out.println(multiply2.andThen(cube).apply(3));
        System.out.println(cube.andThen(multiply2).apply(3));

        //compose same as function2.andThen(function1)
        System.out.println(multiply2.compose(cube).apply(3));

        //Returns the same thing. identity is a static fucntion
        Function<Integer,Integer> identity = Function.identity();
        System.out.println(identity.apply(5));



    }
}
