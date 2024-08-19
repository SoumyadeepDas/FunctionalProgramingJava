package edu.functionaljava;

import java.util.function.Consumer;

public class ClosuresAndScopeInLambdas {

    public static Consumer<Integer> counter(){
        int count = 0;
        Consumer<Integer> increment =  x -> System.out.println(count+1);
        //count = count+1; This is not possible because count is final or effectively final (it has to be final either ways) as
        //count is being used by the lambda expression, the lambda locks the VALUE of the count since, lambdas can be
        //passed to any other methods as first functions, lambda ensures that once a variable is used by any lambda, it
        //cannot be changed, as it might be used in other methods provided the lambda is passed to another method.
        return increment;
    }

    public static void main(String[] args) {
        Consumer<Integer> getIncrement = ClosuresAndScopeInLambdas.counter();
        getIncrement.accept(0);
    }
}
