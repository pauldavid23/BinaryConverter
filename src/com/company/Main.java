package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {

        System.out.println("Enter a number from 0 to 255 to convert to binary. ");

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num >= 0 && num <= 255) {

                if (num >= 128) {
                    System.out.print("1");
                    num %= 128;
                } else {
                    System.out.print("0");
                }
                if (num >= 64) {
                    System.out.print("1");
                    num %= 64;
                } else {
                    System.out.print("0");
                }
                if (num >= 32) {
                    System.out.print("1");
                    num %= 32;
                } else {
                    System.out.print("0");
                }
                if (num >= 16) {
                    System.out.print("1");
                    num %= 16;
                } else {
                    System.out.print("0");
                }
                if (num >= 8) {
                    System.out.print("1");
                    num %= 8;
                } else {
                    System.out.print("0");
                }
                if (num >= 4) {
                    System.out.print("1");
                    num %= 4;
                } else {
                    System.out.print("0");
                }
                if (num >= 2) {
                    System.out.print("1");
                    num %= 2;
                } else {
                    System.out.print("0");
                }
                if (num >= 1) {
                    System.out.print("1");
                    num %= 1;
                } else {
                    System.out.print("0");
                }





            } else {
                System.out.println("Invalid number! Input 0 to 255 only. ");
            }







        } else {
            System.out.println("Invalid input!");
        }



    }
}
