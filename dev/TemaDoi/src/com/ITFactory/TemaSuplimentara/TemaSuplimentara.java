package com.ITFactory.TemaSuplimentara;

import com.ITFactory.oop.inheritenc.Parent;

import java.util.Hashtable;
import java.util.Scanner;

public class TemaSuplimentara {

    public static void main(String[] args) {
//        pickDay();
//        leapYear();
        pickDirection();
    }

    /*
    Switch
    Scrieti un program care sa accepte un cuvant de la tastatura(zi a saptamanii).
    In functie de ce scrieti, se va printa ziua saptamanii in engleza.
    Daca se introduce un cuvant care nu reprezinta o zi din saptamana,
    printati "ziua nu exista". Optional : faceti programul sa puteti tasta
    de la tastatura de maxim 7 ori. Exemplul de mai jos printeaza altceva.
    */
    public static void pickDay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a day of the week in Romanian.");
        String dayWeek = scanner.nextLine();

        boolean switchFlag = true;
        int switches = 7;
        while(switchFlag && (switches > 1)) {
            switches--;
            switch (dayWeek.toLowerCase()) {
                case "luni": {
                    System.out.println("Monday");
                    switchFlag = false;
                    break;
                }
                case "marti": {
                    System.out.println("Tuesday");
                    switchFlag = false;
                    break;
                }
                case "miercuri": {
                    System.out.println("Wednesday");
                    switchFlag = false;
                    break;
                }
                case "joi": {
                    System.out.println("Thursday");
                    switchFlag = false;
                    break;
                }
                case "vineri": {
                    System.out.println("Friday");
                    switchFlag = false;
                    break;
                }
                case "sambata": {
                    System.out.println("Saturday");
                    switchFlag = false;
                    break;
                }
                case "duminica": {
                    System.out.println("Sunday");
                    switchFlag = false;
                    break;
                }
                default: {
                    System.out.println("Switches remaining: " +switches);

                    System.out.println("This does not seem to be a valid week day.");
                    dayWeek = scanner.nextLine();


                }
            }
        }
    }

    /*
    If statement + operatori
    Scrieti un program care sa analizeze daca un an este bisect.
    Ce inseamna an bisect? Stim ca un an bisect are loc o data la 4 ani.
    Dar asta nu inseamna ca la fiecare 4 ani este un an bisect.
    Daca anul este divizibil cu 100 dar nu este divizibil cu 400,
    atunci anul nu este bisect ( de exemplu 1800/ 1900).
    2000 de exemplu a fost un an bisect
     */

    public static void leapYear(){
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while(flag){
            System.out.print("Please pick a year: ");
            int year = scanner.nextInt();
            String pastOrFuturePositive = "";
            String pastOrFutureNegative = "";

            if(year <= 2023) {
                pastOrFuturePositive = "was";
            }
            if(year > 2023) {
                pastOrFuturePositive = "will be";
            }

            if(year <= 2023) {
                pastOrFutureNegative = "was not";
            }
            if(year > 2023) {
                pastOrFutureNegative = "will not be";
            }

            if(year % 4 != 0) {
//                System.out.println("CAZ 1");
                System.out.println("This " + pastOrFutureNegative + " a leap year.");

            }
            if(year % 4 == 0 && year % 100 != 0){
//                System.out.println("CAZ 2");
                System.out.println("This " + pastOrFuturePositive + " a leap year.");
                    flag = false;
                }
            if(year % 4 == 0 && year % 100 == 0){
                if (year % 400 != 0){
//                    System.out.println("CAZ 3");
                    System.out.println("This " + pastOrFutureNegative + " a leap year");
                }
                else if(year % 400 == 0){
//                    System.out.println("CAZ 4");
                    System.out.println("This " +pastOrFuturePositive+ " a leap year.");
                    flag = false;
                }

            }

        }
    }

    /*
    Switch + char + String
    Sa se citeasca de la tastatura un singur caracter, idiferent daca este 'A' sau 'a'.
    In functie de ce tastati, se vor afisa directiile in care va indreptati.
    Daca nu tastati una din literele n/ v / e / s se va printa mesajul
    "esti pierdut" si se va iesi din loop.

     */
    public static void pickDirection(){
        Scanner scanner = new Scanner(System.in);
        boolean directionsFlag = true;

        Hashtable<String, Integer> pathHistory = new Hashtable<String, Integer>();
        pathHistory.put("N", 0);
        pathHistory.put("W", 0);
        pathHistory.put("S", 0);
        pathHistory.put("E", 0);


        while(directionsFlag){
            System.out.println(
                            "pathHistory:" + "\n" + "N: " + pathHistory.get("N") +
                            "\n"+"W: " + pathHistory.get("W") +
                            "\n"+"S: " + pathHistory.get("S") +
                            "\n"+"E: " + pathHistory.get("E"));
            System.out.println("Your position is " + (pathHistory.get("N") - pathHistory.get("S")) + " rooms north of the starting point, and " + (pathHistory.get("W") - pathHistory.get("E")) + " rooms west");

            System.out.println("Please select which way you'd like to go: N / W / S / E.");
            String direction = scanner.nextLine().toUpperCase();
            switch (direction){
                case "N":{
                    System.out.println("You move north.");
                    pathHistory.put("N", pathHistory.get("N") + 1);
                    break;
                }
                case "W":{
                    System.out.println("You move west.");
                    pathHistory.put("W", pathHistory.get("W") + 1);

                    break;
                }
                case "S":{
                    System.out.println("You move south.");
                    pathHistory.put("S", pathHistory.get("S") + 1);

                    break;
                }
                case "E":{
                    System.out.println("You move east.");
                    pathHistory.put("E", pathHistory.get("E") + 1);

                    break;
                }
                default:
                    System.out.println("You are lost!");
                    directionsFlag = false;
                    break;

            }
        }

    }
}

