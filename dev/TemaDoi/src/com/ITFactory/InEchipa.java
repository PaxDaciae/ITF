package com.ITFactory;

import java.util.Scanner;
/*
    Problema 8.
    Scrieți un program în care creati o consola interactiva prin care userul poate sa aleaga opțiuni de la 1 la 3.
    La start-ul programului, va trebui să apară un mesaj cu opțiunile posibile.
    a) Pentru opțiunea 1, userul va trebui sa introducă un număr de la 1 la 10.
    Dacă numărul nu este în acest interval se va afișa un mesaj de eroare.
    b) Pentru opțiunea 2 userul va trebui sa introduca doua numere întregi și se va afisa suma acestora
    c) Pentru opțiunea 3 userul va trebui sa introducă un număr întreg pozitiv (se va face verificarea)
    iar pe baza acestuia se vor afișa toate numerele de la 0 pana la acesta.
 */

public class InEchipa {
    public static void main(String[] args) {

        //Create scanner and instruct user on what to do:
        Scanner userInput = new Scanner(System.in);
        System.out.println("Alege optiunea");

        //Read and store user choice as integer
        int optiunea = userInput.nextInt();

        //Start of switch loop based on user input value
        switch(optiunea){
            //If user chose "1"
            case 1:
                System.out.println("Introduceti un numar de la 1 la 10");
                // Store input as integer
                int unNumar = userInput.nextInt();
                    //Check if input is more or equal to 1 and less or equal to 10
                    if(unNumar >= 1 && unNumar <= 10){
                         System.out.println("da");
                    }else{
                         System.out.println("nu");
                    }
                //Switch loop ends
                break;
            //If user chose "2"
            case 2:
                System.out.println("Introduceti 2 numere intregi");
                //Read and store user input as int
                System.out.println("introdu primul numar");
                int numarUnu = userInput.nextInt();

                //Read and store user input as int
                System.out.println("introdu al doilea numar");
                int numarDoi= userInput.nextInt();

                //Store sum of input numbers and return to user
                int suma = numarDoi+numarUnu;
                System.out.println(suma);

                //Switch loop ends
                break;

            //If user chose "3"
            case 3:
                //Read and store user input as int
                System.out.println("Introduceti un număr întreg pozitiv (si vom verifica)");
                int altNumar = userInput.nextInt();

                //If user input is not a positive number, then
                if (altNumar <0){
                    //Tell user their choice is bad
                    System.out.println("te rog pozitiv");
                    //Ask for new input
                    altNumar = userInput.nextInt();
                //If loop ends here
                }
                //If user input passes check and is a positive number
                //Start a counter from step 0, for an 'altNumar' (user input number) number of steps,
                //Adding 1 to th counter on each step ("i" represents the number of the step)
                for(int i = 0; i <= altNumar; i++){
                    //And for each step return the number of the step to the user
                    System.out.println("numarul : " + i);
                }
                //Switch loop ends
                break;

            //If the user chose an option that's not valid, then
            default:
                //Tell them their choice is not valid and
                System.out.println("Valoare incorecta");
                //Switch loop ends
                break;

        };
    }
}
