package com.trigger_soft.controlstructures;

public class SwitchCase {

    public static void main(String[] args) {
        String env = "xyz";

        switch (env) {
            case "dev":
                System.out.println("Development environment!");
                break;
            case "prod":
                System.out.println("Production environment!");
                break;
            default:
                System.out.println("Unknown environment!");
                break;
        }
    }
}
