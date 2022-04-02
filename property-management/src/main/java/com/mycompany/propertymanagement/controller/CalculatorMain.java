package com.mycompany.propertymanagement.controller;

public class CalculatorMain {

    public static void main(String[] args) {
        // creating instance of a controller and then call its method and passed the value
        CalculatorController cc = new CalculatorController();
        Double result = cc.add(7.7,9.9);
        System.out.println(result);
    }
}
