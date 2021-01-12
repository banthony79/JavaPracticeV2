package com.brycelooyenga.sumoddrange;

//List the sums of all odd numbers within a certain range

public class Main {

    public static void main(String[] args) {
        SumOddRange.sumOdd(1, 100);
        SumOddRange.sumOdd(-1, 100);
        SumOddRange.sumOdd(100, 100);
        SumOddRange.sumOdd(13, 13);
        SumOddRange.sumOdd(100, -100);
        SumOddRange.sumOdd(100, 1000);
        SumOddRange.sumOdd(10, 5);
    }
}
