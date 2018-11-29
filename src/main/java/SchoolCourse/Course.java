package SchoolCourse;

import java.util.Date;

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
}
