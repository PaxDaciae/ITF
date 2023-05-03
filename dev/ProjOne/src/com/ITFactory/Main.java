package com.ITFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Set up a scanner component to ask user whether
        //To use a middle name or not
        Scanner nameCheck = new Scanner(System.in);

        //Capture the answer from the user and
        System.out.println("Will you be using a middle name: Y/N?");

        //Save it as a variable
        String hasMiddleName = nameCheck.nextLine();

        AfisareNume(hasMiddleName);

    }


    public static void AfisareNume(String hasMiddleName){

        //Initialize scanner object, one for fist name one for last name, to record user input;
        Scanner firstNameScanner = new Scanner(System.in);
        Scanner lastNameScanner = new Scanner(System.in);

        //Prompt user to input their first name and store it as a variable;
        System.out.print("Please insert your (first) name: ");
        String firstName = firstNameScanner.nextLine();

        //Start if decision tree depending on whether the user has selected the option of
        //Using a middle name or not
        //If the user has selected yes on the option:
        if(hasMiddleName.equals("Y") || hasMiddleName.equals("y")) {

            //Initialize scanner object to capture their middle name
            Scanner middleNameScanner = new Scanner(System.in);

            //Prompt user to input their middle name
            System.out.print("Please insert your (middle) name: ");

            //And store it as a variable
            String middleName = middleNameScanner.nextLine();

            //Prompt user to input their last name
            System.out.print("Please insert your (last) name: ");

            //And store it as a variable
            String lastName = lastNameScanner.nextLine();

            //Print final message by bringing all names together
            System.out.println("Welcome, " + firstName + " " + middleName + " " + lastName + "!");

        }
        //If the user has decided not to use a middle name
        else {

            //Prompt user to input their last name
            System.out.print("Please insert your (last) name: ");

            //And store it as a variable
            String lastName = lastNameScanner.nextLine();

            //Print final message by bringing all names together
            System.out.println("Welcome, " + firstName + " " + lastName + "!");
        }
    }
}