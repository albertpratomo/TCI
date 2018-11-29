package BasicStatistic;

import BasicStatistic.MyFirstClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyFirstClassTest {

    @Test
    public void shouldReturnCorrectId() {
        // arrange
        MyFirstClass sut = new MyFirstClass(1,"Albert");
        int result;
        // act
        result = sut.getId();
        // assert
        assertEquals("Expected result should be 1", 1, result);
    }
}