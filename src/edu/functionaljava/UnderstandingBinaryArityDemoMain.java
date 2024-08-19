package edu.functionaljava;


import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class UnderstandingBinaryArityDemoMain {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> myFunc = (x,y)->x+y;
        System.out.println("The Sum is "+myFunc.apply(5,6));

        BiConsumer<Integer,String> myFunc2 = (x,y)-> System.out.println(y + " " +x);
        myFunc2.accept(5,"Soumya");

        BiPredicate<String, String> myFunc3 = (str1,str2)-> str1.equals(str2);
        System.out.println(myFunc3.test("soumya","soumya"));
    }
}
