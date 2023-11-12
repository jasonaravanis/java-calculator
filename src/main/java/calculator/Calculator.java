package calculator;

public class Calculator {
    private static Double add (Double numberA, Double numberB) {
        return numberA + numberB;
    }

    private static Double subtract (Double numberA, Double numberB) {
        return numberA - numberB;
    }

    private static Double multiply (Double numberA, Double numberB) {
        return numberA * numberB;
    }

    private static Double divide (Double numberA, Double numberB) {
        return numberA / numberB;
    }

    public static Double calculate(Double numberA, Operator operator, Double numberB) {
        switch (operator) {
            case ADD -> {
                return add(numberA, numberB);
            }
            case SUBTRACT -> {
                return subtract(numberA, numberB);
            }
            case MULTIPLY -> {
                return multiply(numberA, numberB);
            }
            case DIVIDE -> {
                return divide(numberA, numberB);
            }
        }

        throw new RuntimeException("No operator found");
    }

}