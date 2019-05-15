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

    /** Finds Course in Day, Returns Course */
    public Course findCourse( String courseID ) {
        for ( Course course : courses ) {
            if ( course.getCourseID().equals(courseID) ) {
                return course;
            }
        }
        return null;
    }

    /** Removes course from Day */
    public void removeCourse( String courseID ) {
        Course course = findCourse(courseID);
        courses.remove(course);
    }
}
