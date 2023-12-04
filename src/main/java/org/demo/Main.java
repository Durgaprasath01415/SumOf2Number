package org.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner First = new Scanner(System.in);
        System.out.printf("Enter the First Value = ");
        int A = Integer.parseInt(First.next());
        Scanner second = new Scanner(System.in);
        System.out.printf("Enter the Second Value = ");
        int B = Integer.parseInt(second.next());
        int result = A + B;
        System.out.println("Result of the Sum = " + result);
    }
}