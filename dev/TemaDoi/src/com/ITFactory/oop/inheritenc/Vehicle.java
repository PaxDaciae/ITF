package com.ITFactory.oop.inheritenc;

import java.util.Objects;

public class Vehicle {

    int yearOfFabrication;
    int cubicCapacity;
    String name;
    String color;

    public Vehicle(int yearOfFabrication, int cubicCapacity, String name, String color) {
        this.yearOfFabrication = yearOfFabrication;
        this.cubicCapacity = cubicCapacity;
        this.name = name;
        this.color = color;
    }

    public int getYearOfFabrication() {
        return yearOfFabrication;
    }

    public void setYearOfFabrication(int yearOfFabrication) {
        this.yearOfFabrication = yearOfFabrication;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfFabrication == vehicle.yearOfFabrication && cubicCapacity == vehicle.cubicCapacity && Objects.equals(name, vehicle.name) && Objects.equals(color, vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfFabrication, cubicCapacity, name, color);
    }

    public int maxSpeed(int speed){
        System.out.println("Functia din Logan");
        return speed - 8;
    }

    public void needService(int date){
        System.out.println("Service needed in: " +date + " days");
    }
}
