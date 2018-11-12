import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(20, 10);
    }

    @Test
    public void canAddNumbers(){
    assertEquals(30, calculator.add());
    }

    @Test
    public void canSubtractNumbers(){
        assertEquals(10, calculator.subtract());
    }

    @Test
    public void canMultiplyNumbers(){
        assertEquals(200, calculator.multiply());
    }

    @Test
    public void canDivideNumbers(){
        assertEquals(2, calculator.divide());
    }
}
