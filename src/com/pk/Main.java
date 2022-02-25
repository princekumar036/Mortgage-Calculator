package com.pk;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        int principle;
        float monthlyInterest;
        float monthlyPayment;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principle: ");
            principle = scanner.nextInt();
            if (principle >= 1000 && principle <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 and 1,000,000.");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest > 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / MONTHS_IN_YEARS / PERCENT;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        while (true) {
            System.out.print("Period (Years): ");
            float years = scanner.nextFloat();
            if (years > 1 && years <= 30) {
                monthlyPayment = years * MONTHS_IN_YEARS;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }

        double mortgage = principle * (monthlyInterest * Math.pow((1 + monthlyInterest), monthlyPayment) / (Math.pow((1 + monthlyInterest), monthlyPayment) - 1));
        String output = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your final mortgage is" + output);
    }
}