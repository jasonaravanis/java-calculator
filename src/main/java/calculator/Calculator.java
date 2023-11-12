package calculator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Calculator {

    private static final MathContext mc = new MathContext(4);
    private static BigDecimal add (BigDecimal numberA, BigDecimal numberB) {
        return numberA.add(numberB, mc);
    }

    private static BigDecimal subtract (BigDecimal numberA, BigDecimal numberB) {
        return numberA.subtract(numberB, mc);
    }

    private static BigDecimal multiply (BigDecimal numberA, BigDecimal numberB) {
        return numberA.multiply(numberB, mc);
    }

    private static BigDecimal divide (BigDecimal numberA, BigDecimal numberB) {
        return numberA.divide(numberB, mc);
    }

    public static String formatResult(BigDecimal rawResult) {
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(rawResult);
    }

    public static BigDecimal calculate(BigDecimal numberA, Operator operator, BigDecimal numberB) {
        return switch (operator) {
            case ADD -> add(numberA, numberB);
            case SUBTRACT -> subtract(numberA, numberB);
            case MULTIPLY -> multiply(numberA, numberB);
            case DIVIDE -> divide(numberA, numberB);
        };
    }

}