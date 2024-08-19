package edu.functionaljava;


import java.util.Scanner;
import java.util.function.Predicate;

public class FunctionConsumerPredicateSupplierInterfaceDemoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string to know it's length using FUNCTION Interface: ");
//        Function<String,Integer> getStringLength = str -> str.length();
//        System.out.println("The length of the entered string is "+getStringLength.apply(sc.nextLine()));
//
//        System.out.println("Enter a string to know the last name using FUNCTION Interface: ");
//        Function<String,String> getSubString = str -> str.substring((str.indexOf(' ')+1));
//        System.out.println("The last name of the entered name is "+getSubString.apply(sc.nextLine()));

//        System.out.println("Enter the name: ");
//        Consumer<String> greetHello = name -> System.out.println("Namaste "+name);
//        greetHello.accept(sc.nextLine());

//        Supplier<String> getStatus = () -> "Good";
//        System.out.println(getStatus.get());

        System.out.println("Enter a number to check whether it's even ! ");
        Predicate<Integer> isEven = num -> num%2 == 0;
        System.out.println(isEven.test(sc.nextInt()));

    }
}
