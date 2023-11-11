package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        Double inputOne = null;
        Double inputTwo = null;

//      Get first input
        do {
            System.out.print("Enter a number: ");
            String inputStr = scanner.nextLine();
            try {
                inputOne = Double.parseDouble(inputStr);
                inputIsValid = true;
            } catch (NumberFormatException nfr) {
                System.out.println("Input was not number, please enter a number!");
            }
        }

        while (!inputIsValid);
        System.out.println("You entered: " + inputOne);

//      Get second input
        inputIsValid = false;
        do {
            System.out.print("Enter a number: ");
            String inputStr = scanner.nextLine();
            try {
                inputTwo = Double.parseDouble(inputStr);
                inputIsValid = true;
            } catch (NumberFormatException nfr) {
                System.out.println("Input was not number, please enter a number!");
            }
        }
        while (!inputIsValid);
        System.out.println("You entered: " + inputTwo);

        double result = inputOne + inputTwo;
        System.out.println("The sum of the two numbers is " + result);
    }
}