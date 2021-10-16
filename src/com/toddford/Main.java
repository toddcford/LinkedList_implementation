package com.toddford;

//import java.awt.*;
//import java.util.Date;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static String reversedString(String my_string) {
        String reversed_string = "";
        for (int i = my_string.length() - 1; i > -1; i--) {
            reversed_string += my_string.charAt(i);
        }
        return reversed_string;
    }

    public static String getMortgagePayment(int principal, float int_rate, int years) {

        double numerator = int_rate * Math.pow(1 + int_rate, years);
        double denominator = Math.pow(1 + int_rate, years) - 1;
        double payment = principal * (numerator / denominator);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(payment);
    }

    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.contains(4));
        System.out.println(list.contains(10));
        System.out.println(list.contains(30));
        list.deleteLast();
        System.out.println("deleted last");
        list.deleteLast();
        System.out.println("deleted last");
        list.deleteLast();
        System.out.println("deleted last");
        list.addFirst(30);
        System.out.println(list.contains(30));



    }
}









       




//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//        Scanner scanner = new Scanner(S   ystem.in);
//
////        System.out.print("Principal ($1k - $1m): ");
////        int principal = scanner.nextInt();
////        while(principal < 1000 || principal > 1_000_000) {
////            System.out.println("Enter a number between 1,000 and 1,000,000");
////            System.out.println("Principal ($1k - $1m): ");
////            principal = scanner.nextInt();
////        }
//        int principal;
//        while (true) {
//            System.out.println("Principal ($1k - $1m): ");
//            principal = scanner.nextInt();
////            if (principal > 1000 && principal < 1_000_000) {
////                break;
////            }
////            System.out.println("Enter a value between $1k and $1m");
////        }
////        System.out.print("Annual Interest Rate: ");
////        float annualInterest = scanner.nextFloat();
////        while (annualInterest < 0 || annualInterest > 30) {
////            System.out.println("Enter a number between 0 and 30");
////            System.out.println("Annual Interest Rate: ");
////            annualInterest = scanner.nextFloat();
////        }
////
////        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
////
////        System.out.print("Number of Years: ");
////        int years = scanner.nextInt();
////        while (years < 0 || years > 30) {
////            System.out.println("Enter a number between 0 and 30");
////            System.out.println("Number of Years: ");
////            years = scanner.nextInt();
////        }
////        int numberOfPayments = years * MONTHS_IN_YEAR;
////
////        String total_payment = getMortgagePayment(principal, monthlyInterest, numberOfPayments);
////        System.out.println(total_payment);


