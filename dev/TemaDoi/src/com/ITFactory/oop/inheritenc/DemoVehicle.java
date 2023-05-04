package com.ITFactory.oop.inheritenc;

public class DemoVehicle {
    public static void main(String[] args) {
        Vehicle logan = new Vehicle(1993, 2900, "Logan", "rosu");
        Vehicle golf = new Vehicle(2000, 3100, "Golf", "gri");
        Vehicle volvo = new Vehicle(2019, 2500, "Volvo", "negru");
        Vehicle volvo2 = new Vehicle(2020, 2400, "Volvo", "negru");

        System.out.println(volvo.equals(volvo2));
        System.out.println(volvo.equals(volvo));

        System.out.println(logan);
        logan.maxSpeed(calculeazaMaxSpeed(10));
    }

    public static int calculeazaMaxSpeed(int viteza){
        System.out.println("functia din DemoVeh: " + (viteza-2));
        return viteza - 2;
    }
}
