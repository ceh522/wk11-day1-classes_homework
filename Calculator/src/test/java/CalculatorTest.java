import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(10,5);
    }

    @Test
    public void AddNumbers(){
        assertEquals(15, calculator.AddNumbers());
    }

    @Test
    public void SubtractNumbers(){
        assertEquals(5, calculator.SubtractNumbers());
    }

    @Test
    public void MultiplyNumbers(){
        assertEquals(50, calculator.MultiplyNumbers());
    }
    @Test
    public void DivideNumbers(){
    assertEquals(2, calculator.DivideNumbers());
    }

}
