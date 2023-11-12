package app;

import calculator.Calculator;
import calculator.Operator;

public class Application {
    /*
    * The application has a calculator class which takes in input parameters and returns calculated values
    * The application has a UserInputRetriever which handles retrieving user input
    * The application starts by initialising a Calculator and a UserInputRetriever (UIR)
    * The UIR will pause execution until the user enters something via the CLI
    * The UIR has no awareness of what needs to be inputted. It just waits to receive and pass on some input
    * */

    public static void main(String[] args) {
        Double inputA = UserInputRetriever.getDoubleFromUser();
        Operator operator = UserInputRetriever.getOperatorFromUser();
        Double inputB = UserInputRetriever.getDoubleFromUser();

        Double result = Calculator.calculate(inputA, operator, inputB);

        System.out.println();
        System.out.println("Result: " + result);
    }

}