package com.trigger_soft.oop.inheritance;

public class MySubClass extends MySuperClass {
    String myCommonString = "Common String from Sub Class";

    public MySubClass() {
        System.out.println("Sub Class Constructor");
    }

    public void printCommonString() {
        System.out.println(myCommonString);
        System.out.println(super.myCommonString);
    }

    public void myCommonMethod() {
        System.out.println("Sub Class Common Method");
    }

    public void printCommonMethod() {
        myCommonMethod();
        super.myCommonMethod();
    }
}
