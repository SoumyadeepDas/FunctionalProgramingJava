package edu.functionaljava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class UnderstandingMethodReferences {
    public static void main(String[] args) {
        Supplier<Double> getSqrt = Math::random;
        System.out.println(getSqrt.get()*100);

        Function<Person,String> getName = p -> p.getName();

        System.out.println("Getting name using Lambda Expression: "+getName.apply(new Person("Foo")));

        Function<Person,String> getNameUsingMethodReference = Person::getName;
        System.out.println("Getting name using Method Reference: "+getNameUsingMethodReference.apply(new Person("Soumya")));

        BiPredicate<Person,Person> checkEquality = (p1, p2) -> p1.equals(p2);
        System.out.println("Checking equality using Lambda Expression: "+checkEquality.test(new Person("Lappu"),new Person("Lappu")));

        BiPredicate<Person,Person> checkEqualityUsingReference = Person::equals;
        Person person1 = new Person("Lappu");
        Person person2 = person1;
        System.out.println("Checking equality using Method Reference: "+checkEqualityUsingReference.test(person1,person2));

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);

        Function<List<Integer>,Integer> getSize = li -> li.size();
        System.out.println("Printing the list size using lambda Expression: "+getSize.apply(Arrays.asList(4,5,6,7,8)));

        Function<List<Integer>,Integer> getSizeUsingReference = List::size;
        System.out.println("Printing the list size using reference: "+getSizeUsingReference.apply(list));

        Function<Person,Person> obj1 = object -> new Person(object);
        System.out.println("Getting hashcode of an object using Lambda Expression: "+obj1.apply(new Person(person1)));

        Function<Person,Person> obj = Person::new;
        System.out.println("Getting hashcode of an object using constructor reference: "+obj.apply(new Person(person1)));

    }
}

class Person{
    private String name;

    public Person(Person person){

    }
    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

}
