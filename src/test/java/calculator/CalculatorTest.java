package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void twoPlusTwoShouldEqualFour() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void threePlusSevenEqualsTen() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(3, 7));
    }
}