package edu.functionaljava;


import java.util.InputMismatchException;
import java.util.Scanner;

@FunctionalInterface
interface ArithmeticOperation{
    double doOperation(double num1, double num2);
}

class InputException extends Exception{
    String invalidInputType;
    public InputException(String invalidInputType) {
        this.invalidInputType = invalidInputType;
        }


    @Override
    public String toString() {
        return "Input type should be an INTEGER, while provided type is a "+invalidInputType.toUpperCase();
    }
}

public class ArithmeticOperationsUsingLambdaDemoMain {

    public double getSum(double input1, double input2){
        ArithmeticOperation add = (num1,num2)->num1+num2;
        return add.doOperation(input1,input2);
    }

    public double getDifference(double input1, double input2){
        ArithmeticOperation difference = (num1,num2)->num1-num2;
        return difference.doOperation(input1,input2);
    }

    public double getProduct(double input1, double input2){
        ArithmeticOperation product = (num1,num2)->num1*num2;
        return product.doOperation(input1,input2);
    }

    public double getQuotient(double input1, double input2){
        ArithmeticOperation quotient = (num1,num2)->num1/num2;
        return quotient.doOperation(input1,input2);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        Double input1=0.0,input2=0.0;
        System.out.println("Enter 2 numbers: ");
        try {
            input1 = sc.nextDouble();
            input2 = sc.nextDouble();
        }
        catch (InputMismatchException exception){
            System.out.println(new InputException("Non Integer Input Type"));
            System.exit(1);
        }
        System.out.println("Enter your choice: 1. For Addition, 2. For Subtraction, 3. For Multiplication & 4. For Division:");
        try {
            System.out.println(getOutput(sc.nextInt(), input1, input2));
        }
        catch (InputMismatchException e) {
            System.out.println(new InputException("Non Integer Input Type"));
        }

    }

    public double getOutput(int choice,double input1, double input2){
        return switch(choice){
            case 1 -> getSum(input1,input2);
            case 2 -> getDifference(input1,input2);
            case 3 -> getProduct(input1,input2);
            case 4 -> getQuotient(input1,input2);
            default -> -1.0;
        };
    }

    public static void main(String[] args) {
        new ArithmeticOperationsUsingLambdaDemoMain().input();
    }
}