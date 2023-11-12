package app;

import java.util.Scanner;

public final class UserInputRetriever {
    /* Stops program execution until user provides some String input via CLI, then returns it */
    private UserInputRetriever() {}

    public static Double getDoubleFromUser() {
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
        return input;
    }
}