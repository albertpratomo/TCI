import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CourseTest {
    @Test
    public void endDateBeforeStartDateShouldThrowException() {
        // arrange
        Date endDate = new Date(2018, 11, 20);
        Date startDate = new Date(2018, 11, 21);
        Course sut = new Course(startDate,endDate);
        // act
        // assert

        assertEquals("If endDate is before startDate, exception should be thrown", 0, result);
        assert
    }
}