package BasicStatistic;

import BasicStatistic.BasicStatistic;
import org.junit.Test;
import static org.junit.Assert.*;

public class BasicStatisticTest {

    @Test
    public void ifNoDataThenItemCountIsZero() {
        // arrange
        BasicStatistic sut = new BasicStatistic();
        int result;
        // act
        result = sut.numberOfDataItems();
        // assert
        assertEquals("Expected result should be 0", 0, result);
    }

    @Test
    public void afterClearDataItemCountIsZero() {
        // arrange
        BasicStatistic sut = new BasicStatistic();
        int result;
        // act
        sut.clearData();
        result = sut.numberOfDataItems();
        // assert
        assertEquals("Expected result should be 0", 0, result);
    }

    @Test
    public void afterAddDataItemCountIsNotZero() {
        // arrange
        BasicStatistic sut = new BasicStatistic();
        int result;
        // act
        sut.addDoubleToData(5.0);
        result = sut.numberOfDataItems();
        // assert
        assertNotEquals("Expected result should be not 0", 0, result);
    }

    @Test
    public void afterAddXDataItemCountIncreasedByX() {
        // arrange
        BasicStatistic sut = new BasicStatistic();
        int countBeforeAdd, countAfterAdd, result;
        int iteration = 5;
        // act
        countBeforeAdd = sut.numberOfDataItems();
        for (int i = 0; i < 5; i++) {
            sut.addDoubleToData(5.0);
        }
        countAfterAdd = sut.numberOfDataItems();
        result = countAfterAdd - countBeforeAdd;
        // assert
        assertEquals("Expected result should be " + iteration, iteration, result);
    }
}