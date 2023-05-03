package com.ITFactory.primitive;

/***
 * Creati un program simplu in care sa calculati si sa afisati perimetrul unui triunghi
 *  Pentru aceasta va trebui sa definiti variabilele necesare si sa afisati rezultatul
 * System.out.println("Perimetrul triunghiului este: " + perimetruTriunghi);
 *
 * Ce este perimetrul unui triunghi?
 *** Este suma lungimilor laturilor
 */
public class Primitive5
{
    public static void main(String[] args)
    {
        int perimetrul = perimetruTriunghi(3, 4, 5);
        System.out.println("Perimetrul triunghiului este: " + perimetrul);
        int perimetrulDoi = perimetruTriunghi(6, 9, 19);
        System.out.println("PerimetrulDoi este: " + perimetruTriunghi(6, 9, 19));
        System.out.println("PerimetrulDoi este: " + perimetruTriunghi(9, 0, 0));

        System.out.println("PerimetrulDoi este: " + perimetruTriunghi(106, 109, 119));

        System.out.println("Perimetrul: " + perimetruTriunghi(26, 29, 219));

    }

    public static int perimetruTriunghi(int a, int b, int c){
        int perimetru = a + b + c;
        return perimetru;
    }
}