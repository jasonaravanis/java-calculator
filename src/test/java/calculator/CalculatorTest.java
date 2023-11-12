package calculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void threePlusSevenEqualsTen() {
        assertEquals("10", Calculator.calculate(new BigDecimal(3), Operator.ADD,new BigDecimal(7)));
    }

    @Test
    void fiveMinusTwoEqualsThree() {

        assertEquals("3", Calculator.calculate(new BigDecimal(5), Operator.SUBTRACT,new BigDecimal(2)));
    }

    @Test
    void threeMultipliedByTwoEqualsSix() {
        assertEquals("6", Calculator.calculate(new BigDecimal(3), Operator.MULTIPLY,new BigDecimal(2)));
    }

    @Test
    void tenDividedByFourEqualsTwoPointFive() {
        String result = Calculator.calculate(new BigDecimal(10), Operator.DIVIDE,new BigDecimal(4));
        assertEquals("2.5", result);
    }

    @Test
    void handlesFloatingPointMath() {
        assertEquals("0.3", Calculator.calculate(new BigDecimal("0.1"), Operator.ADD, new BigDecimal("0.2")));
    }

    @Test
    void handleOtherFloatingPath() {
        assertEquals("2.333", Calculator.calculate(new BigDecimal("0.7"), Operator.DIVIDE, new BigDecimal("0.3")));
    }
}