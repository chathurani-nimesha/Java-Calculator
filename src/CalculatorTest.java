import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(15.0, Calculator.addition(10,5),0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(5.0,Calculator.subtraction(10,5),0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(50.0,Calculator.multiplication(10,5),0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0,Calculator.division(10,5),0.001);
    }

    @Test
    public void testDecimalAddition(){
        assertEquals(13.0,Calculator.addition(12.5,0.5),0.001);
    }

    @Test
    public void testDivisionByZero(){
        try {
            Calculator.division(10,0);
            fail("Expected ArithmeticException");
        }catch (ArithmeticException e){
            assertEquals("Division by zero is not allowed.",e.getMessage());
        }
    }

}