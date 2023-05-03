package com.ITFactory.primitive;

/***
 * Creati un program simplu in care sa calculati si sa afisati aria unui dreptunghi.
 * Pentru aceasta va trebui sa definiti variabilele necesare si sa afisati rezultatul
 * System.out.println("Aria dreptunghiului este: " + arieDreptunghi);
 *
 * Ce este aria unui dreptunghi?
 *** Este produsul lungimii si al latimii
 */
public class Primitive6
{
    public static void main(String[] args)
    {
        int aria = ariaTriunghi(3, 4);
        System.out.println("Perimetrul triunghiului este: " + aria);
    }

    public static int ariaTriunghi(int inaltimea, int lungimea){
        int aria = inaltimea * lungimea;
        return aria;
    }
}