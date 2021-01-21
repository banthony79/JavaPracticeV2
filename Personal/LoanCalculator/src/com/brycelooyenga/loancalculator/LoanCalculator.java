package com.brycelooyenga.loancalculator;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class LoanCalculator {

    public static Scanner scanner = new Scanner(System.in);

    public static double interestCalculator(double monthlyPayment, double loanAmount, double interestRate) {
        double paymentPeriod = (int) loanAmount / monthlyPayment;
        double interest = (loanAmount * (interestRate / 100) * (paymentPeriod / 12));
        return (interest + loanAmount) / monthlyPayment;

    }

    public static double totalLoanAmount(double monthlyPayment, double loanAmount, double interestRate) {
        double paymentPeriod = (int) loanAmount / monthlyPayment;
        return (loanAmount * (interestRate / 100) * (paymentPeriod / 12) + loanAmount);
    }

    public static void loanTime(double monthlyPayment, double loanAmount, double interestRate) {
        double totalAmount = (loanAmount * (interestRate / 100) * ((loanAmount / monthlyPayment) / 12) + loanAmount);
        double paymentPeriod = (int) totalAmount / monthlyPayment;
        int years = (int) (paymentPeriod / 12);
        int months = (int) (paymentPeriod % 12);
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, years);
        cal.add(Calendar.MONTH, months);
        String[] strMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        System.out.println("Your loan will be paid off in " + strMonths[cal.get(Calendar.MONTH) - 1] + " of " + cal.get(Calendar.YEAR));

    }

    public static void main(String[] args) {
        System.out.println("Please enter loan amount");
        double loanAmount = scanner.nextDouble();
        System.out.println("Please enter monthly payment");
        double monthlyPayment = scanner.nextDouble();
        System.out.println("Please enter interest rate");
        double interestRate = scanner.nextDouble();
        double years = (int) interestCalculator(monthlyPayment, loanAmount, interestRate) / 12;
        double months = (int) interestCalculator(monthlyPayment, loanAmount, interestRate) % 12;
        System.out.println("Your loan will paid off in " + years + " years and " + months + " months");
        System.out.println("Your total loan amount will be " + "$" + String.format("%.2f", totalLoanAmount(monthlyPayment, loanAmount, interestRate)));
        loanTime(monthlyPayment, loanAmount, interestRate);

    }
}
