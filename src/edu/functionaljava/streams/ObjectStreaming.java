package edu.functionaljava.streams;

import java.util.List;
import java.util.stream.Stream;

class Student {
    private String name;
    private int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class ObjectStreaming {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(new Student("Foo", 1), new Student("Bar", 2),
                new Student("Ba", 3));
        //studentStream.filter(str -> str.getName().length()>2).forEach(System.out::println);
        //List<String> list = studentStream.filter(str -> str.getName().length() > 2).map(str -> str.getName()).toList();
        List<String> list = studentStream.filter(str -> str.getName().length() > 2).map(Student::getName).toList();
        System.out.println("list = " + list);
    }
}
