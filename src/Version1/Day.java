package Version1;

import java.util.ArrayList;

/** Represents a Single Version1.Day of the SemesterCalendar */
public class Day {
    /** Version1.Day Number */
    public int dayNum;

    /** Version1.Day Name */
    public String dayName;

    /** Week Number */
    public int weekNum;

    /** Courses on this Version1.Day */
    private ArrayList<Course> courses;

    /** Constructor --> Version1.Day */
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

    /** Adds course into Version1.Day */
    public void addCourse( Course course ) {
        this.courses.add(course);
    }

    /** Removes course from Version1.Day */
    public void removeCourse( Course course ) {
        courses.remove(course);
    }

    /** toString */
    @Override
    public String toString() {
        return "DAY { dayName=" + dayName + " weekNum=" + weekNum + " courses=" + courses + " }";
    }
}
