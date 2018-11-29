package Calculator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {

    //Happy variables = variables that are correct (will give correct results)
    private static final Object[] getHappyVariables() {
        return new Object[] {
                new Object[] {1, 2},
                new Object[] {3, 4}
        };
    }

    @Parameters(method = "getHappyVariables")
    @Test
    public void canAddTwoIntegers(int first, int second) {
        //arrange
        int expected = first + second;
        int result;
        //act
        result = new Calculator().add(first, second);
        //assert
        assertEquals("Expected result should be " + expected, expected, result);
    }
}

