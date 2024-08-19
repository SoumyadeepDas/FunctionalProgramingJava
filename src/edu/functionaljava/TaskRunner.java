package edu.functionaljava;

import java.time.LocalDateTime;

public class TaskRunner {
    public static void runner(Task task) {
        System.out.println("Start Time Log: "+LocalDateTime.now());
        task.run();
        System.out.println("End Time Log: "+LocalDateTime.now());
    }

    public static void main(String[] args) {
        Task task = new Task(){

            @Override
            public void run() {
                System.out.println("hello world");
            }
        };
        TaskRunner.runner(task);
    }
}

interface Task{
    void run();
}