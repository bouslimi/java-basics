package com.trigger_soft.controlstructures;

public class ForLoop {

    public static void main(String[] args) {
        String str = "Java";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 3)
                break;
        }
    }
}
