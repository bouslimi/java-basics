package com.trigger_soft.controlstructures;

public class DoWhileLoop {

    public static void main(String[] args) {
        int i = 5;
        do {
            // this code will be executed at least one time (even if the while condition is false)
            System.out.println(i);
            i++;
        } while (i < 0);
    }
}
