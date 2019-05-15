import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** Represents a Single Day of the Calendar */
public class Day {
    /** Day Number */
    public int dayNum;

    /** Week Number */
    public int weekNum;

    /** Courses on this Day */
    public List<Course> courses;

    /** Constructor --> Day */
    public Day( int dayNum, int weekNum ) {
        this.dayNum = dayNum;
        this.weekNum = weekNum;
        this.courses = new ArrayList<>();
    }

    /** Adds course into Day */
    public void addCourse( Course course ) {
        this.courses.add(course);
    }

    /** Removes course from Day */
    public void removeCourse( Course course ) {
        courses.remove(course);
    }
}
