package com.ITFactory.primitive;

import java.math.BigInteger;

/**
 * Rezolvati greselile din acest cod
 */
public class Primitive1
{
    public static void main(String[] args)
    {
        int intValue1= 1;
        // 'int' primitives can only store whole numbers / integers.
        // Either remove decimals or change to float
//        int intValue2 = 5.1;
        float intValue2 = 5.1f;

        long longValue1 = 150000L;

        // 'long' value too long; max storable value in long is 9,223,372,036,854,775,807
        // Reduce variable value, or find another inventive way of storing.
        // Or use BigInteger class instead, but this changes its type.
        // longValue2.getClass() --> java.math.BigInteger
//        long longValue2 = 10000000000000000000000000000000000L;

//        BigInteger longValue2 = new BigInteger("10000000000000000000000000000000000");
        long longValue2 = 1000000000000000000L;

        float floatValue1 = 1.3f;
        //This float needs an 'f' added to the end of the number
        //To make it a valid definition
//        float floatValue2 = 23.123123;
        float floatValue2 = 23.123123f;

        double doubleValue1 = 2.5d;
        //This double needs a 'd' added to the end of the number
        //To make it a valid definition
//        double doubleValue2 = 123.443423;
        double doubleValue2 = 123.443423d;

        boolean booleanValue1 = true;
        //Booleans can only store 'true' /  'false'
//        boolean booleanValue2 = 5;
        boolean booleanValue2 = true;

        char charValue1 = 'a';
        //char primitives can be defined using either a character or the ASCII code
        //Of a character; need to remove the 'c' from the end of the
        //ASCII code
//        char charValue2 = 67c;
        char charValue2 = 67;

        System.out.println("intValue1: " + intValue1);
        System.out.println("intValue2: " + intValue2);
        System.out.println("longValue1: " + longValue1);
        System.out.println("longValue2: " + longValue2);
        System.out.println("floatValue1: " + floatValue1);
        System.out.println("floatValue2: " + floatValue2);
        System.out.println("doubleValue1: " + doubleValue1);
        System.out.println("doubleValue2: " + doubleValue2);
        System.out.println("booleanValue1: " + booleanValue1);
        System.out.println("booleanValue2: " + booleanValue2);
        System.out.println("charValue1: " + charValue1);
        System.out.println("charValue2: " + charValue2);
    }
}
