package com.ITFactory;

public class Contains {
    public static void main(String[] args) {
        String strg = "AAAAAA";
        if(strg.toLowerCase().contains("a")){
            System.out.println("valid" + "\n" +"AJAJJAJA");
        };

        String constantString1 = "Baeldung";
        String constantString2 = "Baeldung";

        boolean isTrue = constantString1 != constantString2;
        System.out.println(isTrue);
    }
}
