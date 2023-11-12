package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void threePlusSevenEqualsTen() {
        assertEquals(10, Calculator.calculate(3.0, Operator.ADD,7.0));
    }

    @Test
    void fiveMinusTwoEqualsThree() {

        assertEquals(3, Calculator.calculate(5.0, Operator.SUBTRACT,2.0));
    }

    @Test
    void threeMultipliedByTwoEqualsSix() {
        assertEquals(6, Calculator.calculate(3.0, Operator.MULTIPLY,2.0));
    }

    @Test
    void tenDividedByFourEqualsTwoPointFive() {
        assertEquals(2.5, Calculator.calculate(10.0, Operator.DIVIDE,4.0));
    }
}