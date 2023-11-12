package application;

import calculator.Operator;

import java.math.BigDecimal;
import java.util.Scanner;

public final class UserInputRetriever {
    private static final Scanner scanner = new Scanner(System.in);
    private UserInputRetriever() {}

    public static BigDecimal getBigDecimalFromUser() {

        boolean inputIsValid = false;
        BigDecimal input = null;
        do {
            System.out.println();
            System.out.print("Enter a number: ");
            String inputStr = scanner.nextLine();
            try {
                if (inputStr.equals("q")) {
                    System.exit(0);
                }
                input = BigDecimal.valueOf(Double.parseDouble(inputStr));
                inputIsValid = true;
            } catch (NumberFormatException nfr) {
                System.out.println("Input was not number, please enter a number!");
            }
        }
        while (!inputIsValid);
        System.out.println();
        System.out.println("You entered: " + input);
        return input;
    }

    public static Operator getOperatorFromUser() {
        boolean inputIsValid = false;
        Integer input = null;
        do {
            System.out.println();
            System.out.println("~~~ Select an operator ~~~");
            System.out.println("1. " + Operator.ADD);
            System.out.println("2. " + Operator.SUBTRACT);
            System.out.println("3. " + Operator.MULTIPLY);
            System.out.println("4. " + Operator.DIVIDE);
            System.out.println();
            System.out.println("Or press 'q' to quit");
            System.out.println("(press 1,2,3,4): ");
            String inputStr = scanner.nextLine();
            try {
                if (inputStr.equals("q")) {
                    System.exit(0);
                }
                input = Integer.parseInt(inputStr);
                if (input > 0 && input < 5) {
                    inputIsValid = true;
                }
            } catch (NumberFormatException nfr) {
                System.out.println("Input was not 1,2,3 or 4, please select an operator!");
            }
        }
        while (!inputIsValid);

        return switch (input) {
            case 1 -> Operator.ADD;
            case 2 -> Operator.SUBTRACT;
            case 3 -> Operator.MULTIPLY;
            case 4 -> Operator.DIVIDE;
            default -> throw new RuntimeException("No operator found");
        };
    }
}