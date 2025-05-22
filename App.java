package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Enter two numbers:");
        
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        
        System.out.println("Choose operation (+ - * /): ");
        String operation = scanner.next();
        
        switch (operation) {
            case "+":
                System.out.println("Result: " + Calculator.add(num1, num2));
                break;
            case "-":
                System.out.println("Result: " + Calculator.subtract(num1, num2));
                break;
            case "*":
                System.out.println("Result: " + Calculator.multiply(num1, num2));
                break;
            case "/":
                try {
                    System.out.println("Result: " + Calculator.divide(num1, num2));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }
        scanner.close();
    }
}