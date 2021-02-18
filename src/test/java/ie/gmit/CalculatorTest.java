package ie.gmit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        double result = calculator.add(3.3, 2.2);
        assertEquals(5.5, result, 0);
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        double result = calculator.subtract(3.3, 2.2);
        assertEquals(1.1, result, 0.09999999999991);
    }

    @Test
    public void  testMultiply(){
        Calculator calculator = new Calculator();
        double result = calculator.multiply(3.33, 10);
        assertEquals(33.3, result, 0);
    }


}
