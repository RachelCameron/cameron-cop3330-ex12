/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal:");
        double principal = input.nextDouble();
        System.out.println("Enter the rate of interest as a percent:");
        double interestrate = (input.nextDouble()/100);
        System.out.println("Enter the number of years:");
        double time = input.nextDouble();
        double total = principal * (1 + (interestrate * time));
        System.out.printf("After %.0f years at %.2f%%, the investment will be worth $%.2f.", time, interestrate * 100, total);
    }
}