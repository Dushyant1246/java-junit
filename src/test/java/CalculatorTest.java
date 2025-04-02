import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(5, calculator.add(2, 3));
        Assert.assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(1, calculator.subtract(3, 2));
        Assert.assertEquals(-3, calculator.subtract(2, 5));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(6, calculator.multiply(2, 3));
        Assert.assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(2, calculator.divide(6, 3));
        Assert.assertEquals(-3, calculator.divide(-9, 3));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = Assert.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
        Assert.assertEquals("Cannot divide by zero", exception.getMessage());
    }
}