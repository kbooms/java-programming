
import com.kevinbooms.ClassesAndObjects.SimpleCalculator;
import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.assertEquals;

class SimpleCalculatorTest {

    // A Unit Test tests one thing, one single scenario
    // a unit test is just a method the you label with @Test
    @Test
     void twoPlusTwoShouldEqualFour() {
        var calc = new SimpleCalculator(); // used var for local type inference
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    void threePlusThreeShouldEqualSix() {
        var calc = new SimpleCalculator();
        assertEquals(6, calc.add(3, 3));
    }

    @Test
    void fourPlusFourShouldEqualEight() {
        var calc = new SimpleCalculator();
        assertEquals(8, calc.add(4, 4));
    }

}