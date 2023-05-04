package com.ITFactory.oop.inheritenc;

import java.util.Objects;

public class Parent {
    public int avere;
    public String culoareOchi;
    public String numeFamilie;

    // Private poate fi accesat doar din clasa
    // Nu din afara clasei;
    private String bijuterii;

    public void vorbeste(String cuvinte) {
        System.out.println("Spune: " + cuvinte);
    }

    private int retrageFonduriFamilie(int suma) {
        return suma;
    }

    public Parent(int avere, String culoareOchi, String numeFamilie, String bijuterii) {
        this.avere = avere;
        this.culoareOchi = culoareOchi;
        this.numeFamilie = numeFamilie;
        this.bijuterii = bijuterii;
    }

    public Parent(int avere, String numeFamilie) {
        this.avere = avere;
        this.numeFamilie = numeFamilie;
    }

    public Parent() {

    }

    public int getAvere() {
        return avere;
    }

    public void setAvere(int avere) {
        this.avere = avere;
    }

    public String getCuloareOchi() {
        return culoareOchi;
    }

    public void setCuloareOchi(String culoareOchi) {
        this.culoareOchi = culoareOchi;
    }

    public String getNumeFamilie() {
        return numeFamilie;
    }

    public void setNumeFamilie(String numeFamilie) {
        this.numeFamilie = numeFamilie;
    }

    public String getBijuterii() {
        return bijuterii;
    }

    public void setBijuterii(String bijuterii) {
        this.bijuterii = bijuterii;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return avere == parent.avere && Objects.equals(culoareOchi, parent.culoareOchi) && Objects.equals(numeFamilie, parent.numeFamilie) && Objects.equals(bijuterii, parent.bijuterii);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avere, culoareOchi, numeFamilie, bijuterii);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
