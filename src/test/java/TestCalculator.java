import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculator {
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }
    @Test
    public void canAdd() {
        assertEquals(10, calculator.addIt(1, 9));
    }

    @Test
    public void canSubtract() {
        assertEquals(9, calculator.subIt(10, 1));
    }

    @Test
    public void canMultiply() {
        assertEquals(10, calculator.multiIt(5, 2));
    }

    @Test
    public void canDivide() {
        assertEquals(5, calculator.divideIt(10, 2), 0.00);
    }

}
