package com.trigger_soft.basics;

public class StaticFinalVariables {

    public static void main(String[] args) {
        // No need to create a new instance of the class in order to access the variable
        System.out.println(TestClass.i);
    }

    public static class TestClass {
        // 1. final: means that the value cannot be changed after initialization (constant)
        // 2. static: means that instead of having space allocated for the field in each object, only one instance is created for the class
        public static final int i = 25;
    }
}
