package com.ITFactory.primitive;

/**
 * Rezolvati greselile din acest cod
 */
public class Primitive4
{
    public static void main(String[] args)
    {
        int x = 3;
        char c = 'c';

        /*
            Este posibil sa adun o variabila de tip int cu o variabila de tip char?
            Practic un numar cu un caracter?
            Raspuns: DA! Deoarece variabilele de tip char sunt reprezentate de numere
            link: https://www.javatpoint.com/char-keyword-in-java (Primitiva 'char').
            Acest link va ajuta pentru a intelge primitiva 'char' https://www.asciitable.com/
         */
        int adunare = x + c;
        System.out.println(adunare);
        System.out.println((char)adunare);

    }
}