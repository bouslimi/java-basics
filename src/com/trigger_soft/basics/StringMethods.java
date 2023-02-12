package com.trigger_soft.basics;

public class StringMethods {

    public static void main(String[] args) {
        String fullName = "First Last";

        System.out.println(fullName);
        System.out.println(fullName.length());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.split(" ")[1]);
        System.out.println(fullName.substring(6));
        System.out.println(fullName.substring(0, 3));   // The char at 3 is not included
        System.out.println(fullName.equals("First Last"));
        System.out.println(fullName.equals("first last"));
        System.out.println(fullName.equalsIgnoreCase("first last"));

        int ageInt = 36; // int
        System.out.println(ageInt);

        String ageString = String.valueOf(ageInt); // String
        System.out.println(ageString);

        int ageInt2 = Integer.parseInt(ageString); // int
        System.out.println(ageInt2);
    }
}
