package application;

import calculator.Calculator;
import calculator.Operator;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        BigDecimal inputA = UserInputRetriever.getBigDecimalFromUser();
        Operator operator = UserInputRetriever.getOperatorFromUser();
        BigDecimal inputB = UserInputRetriever.getBigDecimalFromUser();

        String result = Calculator.calculate(inputA, operator, inputB);

        System.out.println();
        System.out.println("Result: " + result);
    }

}