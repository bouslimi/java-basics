package com.trigger_soft.basics;

public class VariablesConstuctors {
    // 1. Variables == Parameters == Fields
    // 1.1. Data types:
    // 1.1.1. Primitive (Data types): int, float, double, boolean
    // 1.1.2. Reference (Data types): String

    // Class Level Variable
    int i;

    // 2. Constructors
    // 2.1. No-argument Constructor
    public VariablesConstuctors() {
        i = -1;
    }

    // 2.2. Parameterized Constructor (with argument)
    public VariablesConstuctors(int i) {
        this.i = i;    // this.i: Class Level Variable // i: Method Level Variable
    }

    // 3. Methods
    public void initialize() {
        i = 5;
    }

    // main method is always static
    public static void main(String[] args) {

        VariablesConstuctors variablesConstuctors = new VariablesConstuctors();
        // myClass.initialize();
        System.out.println(variablesConstuctors.i);

        VariablesConstuctors basicsClass2 = new VariablesConstuctors(20);
        System.out.println(basicsClass2.i);
    }
}
