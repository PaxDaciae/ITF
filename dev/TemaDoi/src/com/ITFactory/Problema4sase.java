package com.ITFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Creați un proiect in Java în care sa aveti următorul pachet default: "com.itfactory".
    Sa se creeze o clasa (numele il veti alege voi) în care sa aveți o metoda main.
    Cerința este sa cititi două numere de la tastatura si sa afisati restul împărțirii lor.
    Exemplu: Dacă citim 10 și 3, restul împărțirii lui 10 la 3 va fi 1. (Puteți sa va uitati peste împărțirea cu rest pentru a înțelege restul împărțirii).
    */
public class Problema4sase {
    public static void main(String[] args) {
//        Scanner readNumOne = new Scanner(System.in);
//        Scanner readNumTwo = new Scanner(System.in);
//
//        System.out.println("Please provide the first number for math:");
//        int numOne = readNumOne.nextInt();
//
//        System.out.println("Please provide the second number for math:");
//        int numTwo = readNumTwo.nextInt();
//
//        ImparteNumere(numOne, numTwo);
//        InmultesteNumere(numOne, numTwo);
//        ImparteCuVirgula(numOne, numTwo);
        ReadUntil();
    }

    public static void ImparteNumere(int a, int b){
        System.out.println(a % b);
    }
    /*
            ------------------------------------------------------------------------------------------------------------------------------------------
    Problema 5.
    Extindeti problema nr 3 de mai sus prin a afișa înmulțirea celor doua numere și împărțirea (cu virgula) a celor doua numere.
            ------------------------------------------------------------------------------------------------------------------------------------------
    */
     public static void InmultesteNumere(int a, int b){
         System.out.println("Result of multiplication: " + a * b);
     }

     public static void ImparteCuVirgula(int a, int b){
         float c = (float) a;
         System.out.println("First number float: " + c);
         float d = (float) b;
         System.out.println("Second number float: " + d);
         System.out.println("Result of float division:" + c / d);

     }

    /*
    Problema 6.

    Scrieți un program în care, folosind o bucla (stabiliti voi care) o sa cititi de la tastatură numere întregi până la intalnirea unui număr divizibil cu 7.
            ------------------------------------------------------------------------------------------------------------------------------------------
    */

    public static void ReadUntil(){
        System.out.println("========================================================");
        //Init scanners for target and input numbers
        Scanner targetScanner = new Scanner(System.in);
        Scanner inputScanner = new Scanner(System.in);

        //Capture and store target number;
        System.out.println("Please provide the target number for while_loop read & compare (must not be 0 *for now*):");
        int target;
//        System.out.println(((Object)target).getClass().getName());

        do {
            try {
                target = targetScanner.nextInt();

                if (((Object)target).getClass().getName() == "java.lang.Integer") break;

            } catch (InputMismatchException e) {
            } finally {
                targetScanner.nextLine();
            }

            System.out.println("Wrong data type!");
            System.out.println("Please provide a target number:");

        } while (true);
//        int target = targetScanner.nextInt();

        //Default input value to 0;
        int input = 0;

        //Start while loop if target and input don't match;
        while(input != target){
            //Capture new input to override default 0 number;
            System.out.println("Please provide the number we're checking:");
            input = inputScanner.nextInt();

            //If input and target match
            if(input == target){

                //Print success and end function;
                System.out.println("Same number! SUCCESS!");
                return;

                //If they do not match;
            }else if((input != target) || input == 0){
                //Print non-success message and loop restarts
                System.out.print("They are not the same number. ");
                //Capture new value for input (REMOVE THIS COMMAND IT MESSES UP MESSAGE DISPLAY)
//                input = inputScanner.nextInt();
            };
        }



    }

    /*
    Problema 7.
    Scrieți un program în care afișați toate numerele întregi de la -100 la 100, mai puțin cele divizibile cu 2 sau cu 3.
            ------------------------------------------------------------------------------------------------------------------------------------------
    */
    /*
    Problema 8.
    Scrieți un program în care creati o consola interactiva prin care userul poate sa aleaga opțiuni de la 1 la 3. La start-ul programului, va trebui să apară un mesaj cu opțiunile posibile.
    a) Pentru opțiunea 1, userul va trebui sa introducă un număr de la 1 la 10. Dacă numărul nu este în acest interval se va afișa un mesaj de eroare.
    b) Pentru opțiunea 2 userul va trebui sa introduca doua numere întregi și se va afisa suma acestora
    c) Pentru opțiunea 3 userul va trebui sa introducă un număr întreg pozitiv (se va face verificarea) iar pe baza acestuia se vor afișa toate numerele de la 0 pana la acesta.
    */
}
