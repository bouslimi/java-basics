package com.trigger_soft.basics;

public class StaticMethods {

    // main method is always static
    public static void main(String[] args) {
        System.out.println(TestClass.i);

        TestClass.initialize();        // No need to create a new instance of the class in order to access the method
        System.out.println(TestClass.i);

        TestClass.i = 20;    // No need to create a new instance of the class in order to access the variable
        System.out.println(TestClass.i);
    }

    public static class TestClass {
        // static variable
        public static int i;

        // static method cause it uses a static variable
        public static void initialize() {
            i = 5;
        }
    }
}
