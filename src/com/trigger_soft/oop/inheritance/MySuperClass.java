package com.trigger_soft.oop.inheritance;

public class MySuperClass {
    String mySuperString = "Super Class String";
    String myCommonString = "Common String from Super Class";

    public MySuperClass() {
        System.out.println("Super Class Constructor");
    }

    public void mySuperClassMethod() {
        System.out.println("Super Class Method");
    }

    public void myCommonMethod() {
        System.out.println("Super Class Common Method");
    }
}
