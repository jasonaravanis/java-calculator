package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        Double input = null;

        do {
            System.out.print("Enter a number: ");
            String inputStr = scanner.nextLine();
            try {
                input = Double.parseDouble(inputStr);
                inputIsValid = true;
            } catch (NumberFormatException nfr) {
                System.out.println("Input was not number, please enter a number!");
            }
        }

        while (!inputIsValid);
        System.out.println("You entered: " + input);

    }
}