import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** Represents a Single Day of the Calendar */
public class Day {
    /** Day Number */
    public int dayNum;

    /** Day Name */
    public String dayName;

    /** Week Number */
    public int weekNum;

    /** Courses on this Day */
    private ArrayList<Course> courses;

    /** Constructor --> Day */
    public Day( int dayNum, int weekNum ) {
        this.dayNum = dayNum;
        switch ( this.dayNum ) {
            case 0:
                this.dayName = "SUN";
                break;
            case 1:
                this.dayName = "MON";
                break;
            case 2:
                this.dayName = "TUES";
                break;
            case 3:
                this.dayName = "WED";
                break;
            case 4:
                this.dayName = "THURS";
                break;
            case 5:
                this.dayName = "FRI";
                break;
            case 6:
                this.dayName = "SAT";
                break;
        }
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

    /** toString */
    @Override
    public String toString() {
        return "DAY { dayName=" + dayName + " weekNum=" + weekNum + " courses=" + courses + " }";
    }
}
