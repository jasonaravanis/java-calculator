package application;

import calculator.Calculator;
import calculator.Operator;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        BigDecimal inputA = UserInputRetriever.getBigDecimalFromUser();

        //noinspection InfiniteLoopStatement
        while (true) {
            Operator operator = UserInputRetriever.getOperatorFromUser();
            BigDecimal inputB = UserInputRetriever.getBigDecimalFromUser();
            BigDecimal result = Calculator.calculate(inputA, operator, inputB);
            inputA = result;

            System.out.println();
            System.out.println("Result: " + Calculator.formatResult(result));
        }

    }

}