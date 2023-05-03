package com.Technically.operatori;

import javax.sound.midi.Soundbank;

public class Operatori {
    public static void main(String[] args) {
        int primulNumar = 5;
        int alDoileaNumar = 123;

//        int suma = primulNumar + alDoileaNumar;
//        System.out.println("Suma " + suma);
//
//        primulNumar = 500;
//        suma = primulNumar + alDoileaNumar;
//
//        System.out.println("Suma " + suma);

        int incremOne = primulNumar++;
        System.out.println("Primul numar: " + incremOne + "");
        incremOne++;
        System.out.println(incremOne);

    }
}
