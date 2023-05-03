package com.ITFactory;

import java.util.Scanner;

public class Problema {
    public static void main(String[] args) {


        // Problema 6.
//    Scrieți un program în care, folosind o bucla (stabiliti voi care) o sa cititi de la tastatură
//    numere întregi până la intalnirea unui număr divizibil cu 7.
//    }
//        loopCheck();
        forWrite();

    }

    public static void loopCheck() {

        Scanner readNumber = new Scanner(System.in);
        System.out.println("We will now check if numbers are divisible by 7.");
        boolean flag = true;
        while (flag) {
            System.out.print("Please insert number:");
            int number = readNumber.nextInt();
            // ba de asta
            if (number % 7 == 0) {
                System.out.println("This number is divisible by 7.");
                flag = false;
            } else {
                System.out.println("This number not is divisible by 7. Let's try again:");
            }
        }

    }


//    Problema 7.
//    Scrieți un program în care afișați toate numerele întregi de la -100 la 100, mai puțin cele divizibile cu 2 sau cu 3.


    public static void forWrite() {

        for (int i = -100; i <= 100; i++) {
//            System.out.println( "I: " + i +" "+ i % 2 +" "+ i % 3);
            if( i % 2 != 0 && i % 3 != 0){
                System.out.println("numar: " +i);
            }
        }
    }
}
