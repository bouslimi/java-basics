package com.trigger_soft.oop.inheritance;

public class MainClass {

    public static void main(String[] args) {
        MySubClass mySubClass = new MySubClass();

        System.out.println(mySubClass.mySuperString);
        mySubClass.mySuperClassMethod();

        mySubClass.printCommonString();

        mySubClass.printCommonMethod();
    }
}
