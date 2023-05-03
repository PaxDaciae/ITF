package com.ITFactory.primitive;

import java.util.Scanner;

public class TemaSuplimentara{
    public static void main(String[] args) {

//        checkPositive();
//        mathAverage();
//        meterToMileConversion();


    }

    //    1. Creati o aplicatie in care sa se printeze daca un numar introdus de la tastatura este pozitiv sau negativ.
    public static void checkPositive(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert your number: ");
        int number = scanner.nextInt();
        boolean positiveness = false;
        if (number > 0) {
            positiveness = true;
        }
        if (positiveness) {
            wrapperMethod("The number is positive");
        } else {
            wrapperMethod("The number is negative");
        }
    }

    //    2. Creati o aplicatie care sa calculeze media aritmetica a doua numere introduse de la tastatura.
    public static void mathAverage(){
        System.out.println("We will now calculate the average of two numbers.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert the first number: ");
        int numberOne = scanner.nextInt();
        System.out.print("Please insert the second number: ");
        int numberTwo = scanner.nextInt();

        wrapperMethod("The average of these two numbers is:" + (numberOne+numberTwo)/2);
    }

    //    3. Creati o aplicatie care sa converteasca metri in mile.
    public static void meterToMileConversion(){
        System.out.println("We will now convert meters to miles.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert the number of meters you want to convert: ");
        int countOfMeters = scanner.nextInt();
        double countOfMiles =((countOfMeters * 0.621371)/1000);
        wrapperMethod(countOfMeters + " meters is " + countOfMeters/1000 + " kilometers, or " +countOfMiles + " miles.");

    }
    public static void wrapperMethod(String text){
        System.out.println("************************************************");
        System.out.println(text);
        System.out.println("************************************************");
    }

}
