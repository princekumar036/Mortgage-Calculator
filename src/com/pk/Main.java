package com.pk;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        double principle = scanner.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double rate = scanner.nextDouble() / 1200;
        System.out.print("Period (Years): ");
        double period = scanner.nextDouble() * 12;

        double mortgage = principle * (rate * Math.pow((1 + rate), period) / (Math.pow((1 + rate), period) - 1));
        String outcome = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(outcome);
    }
}