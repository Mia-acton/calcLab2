package ie.atu.week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println();

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered: " + firstNum);

        System.out.println("Please enter a second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered: " + secondNum);

        System.out.println("Please choose an operation (add, subtract, multiply, divide): ");
        String operation = scan1.next();


        boolean validOperation = true;
        switch (operation) {
            case "add":
                add(firstNum, secondNum);
                break;

            case "subtract":
                subtract(firstNum, secondNum);
                break;

            case "multiply":
                multiply(firstNum, secondNum);
                break;

            case "divide":
                divide(firstNum, secondNum);
                break;

            default:
                System.out.println("Invalid Operation.");
                break;
            }
        }

        public static void add(double first, double second) {
        double result = first + second;
            System.out.println("The total is " + result);
    }

        public static void subtract(double first, double second) {
        double result = first - second;
            System.out.println("The total is " + result);
    }

        public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println("The total is " + result);
    }

        public static void divide(double first, double second) {
        double result = first / second;
        if (second == 0) {
                System.out.println("WARNING! Dividing by 0 will result in a mathematical error.");
            }
        else {
            System.out.println("The total is " + result);
        }
    }
}


