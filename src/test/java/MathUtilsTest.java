import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void testDivide_ValidDivision() {
        assertEquals(5, MathUtils.divide(10, 2), "10 / 2 should be 5");
        assertEquals(-3, MathUtils.divide(-9, 3), "-9 / 3 should be -3");
    }

    @Test
    void testDivide_ByZero_ShouldThrowException() {
        Exception exception = assertThrows(ArithmeticException.class, () -> MathUtils.divide(10, 0));
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}