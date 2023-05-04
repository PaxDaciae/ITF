package com.ITFactory.oop.inheritenc;

public class DemoParent {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child1 = new Child();
        child1.setAvere(100);
        child1.setBijuterii("bijuteriile parintlor");
        Nepot nepot1 = new Nepot();
        nepot1.setBijuterii("bijuteriile familiei");

        System.out.println(nepot1.getBijuterii());
        System.out.println(nepot1);
    }
}
