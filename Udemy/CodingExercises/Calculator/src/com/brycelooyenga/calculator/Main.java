package com.brycelooyenga.calculator;

public class Main {

    //a program that calulates how much carpet will be needed for a space and
    //what the cost will be

    public static void main(String[] args) {

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(-1.5);
        System.out.println(carpet.getCost());
        floor = new Floor(-2, 5);
        System.out.println(floor.Area());

    }
}
