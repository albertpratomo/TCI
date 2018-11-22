package SchoolCourse;

import SchoolCourse.Course;
import SchoolCourse.CourseDateException;
import org.junit.Test;

import java.util.Date;

public class CourseTest {
    @Test(expected = CourseDateException.class)
    public void endDateBeforeStartDateShouldThrowException() throws CourseDateException {
        // arrange
        Date endDate = new Date(2018, 11, 20);
        Date startDate = new Date(2018, 11, 21);
        // act
        // assert
        Course sut = new Course(startDate,endDate);
    }
}