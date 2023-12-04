package org.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner times = new Scanner(System.in);
        System.out.println("Enter how many value u want to add : ");
        int n = Integer.parseInt(times.next());
        List val = new ArrayList<>();
        while (n > 0) {
            Scanner value = new Scanner(System.in);
            System.out.printf("Enter the Value = ");
            val.add(value.next());
            n--;
        }
        int result = 0;
        for (int i = 0; i < val.size(); i++) {
            result += Integer.parseInt((String) val.get(0));
        }
        System.out.println("Result of the Sum = " + result);
    }
}