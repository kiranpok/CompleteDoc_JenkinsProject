package org.example;

import java.util.Scanner;

import static org.example.Calculator.add;

public class Main{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = add(num1, num2);
        System.out.println("Result of addition: " + result);

        scanner.close();
    }
}

