package SchoolCourse;

import java.util.Date;
import java.util.Objects;

public class Course {

    private Date startDate;
    private Date endDate;

    public Course(Date startDate, Date endDate) throws CourseDateException {
        if (endDate.before(startDate)) {
            throw new CourseDateException("endDate should be after startDate");
        }
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(startDate, course.startDate) &&
                Objects.equals(endDate, course.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, endDate);
    }
}
