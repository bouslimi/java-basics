package com.trigger_soft.basics;

public class Methods {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        String firstName = testClass.getFirstName("First Last");
        System.out.println(firstName);

        int c = testClass.addInts(5, 3);
        System.out.println(c);
    }

    public static class TestClass {
        public String getFirstName(String fullName) {
            return fullName.split(" ")[0];
        }

        public int addInts(int a, int b) {
            return a + b;
        }
    }
}
