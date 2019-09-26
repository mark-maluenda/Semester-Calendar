package Version1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** SemesterCalendar Class */
public class SemesterCalendar implements Days {
    /** Weeks */
    public final static int WEEKS = 16;

    /** Version1.Days */
    public final static int DAYS = 7;

    /** SemesterCalendar Array */
    public Day[][] calendar;

    /** List of Courses in the Semester */
    public List<Course> courses;

    /** Constructor --> SemesterCalendar */
    public SemesterCalendar() {
        this.calendar = new Day[DAYS][WEEKS];
        this.courses = new ArrayList<>();
        for ( int y = 0 ; y < WEEKS ; y++ ) {
            for ( int x = 0 ; x < DAYS ; x++ ) {
                calendar[x][y] = new Day(x, y);
            }
        }
    }

    /** Getter --> Version1.Day at Given Version1.Day and Week */
    public Day getDay( int day, int week ) {
        return calendar[day][week];
    }

    /** Getter --> Version1.Days Per Week */
    public int getDays() {
        return DAYS;
    }

    /** Getter --> Weeks in Semester */
    public int getWeeks() {
        return WEEKS;
    }

    /** Gets Index Value for Given Version1.Day */
    public int getDayIndex( String dayName ) {
        switch ( dayName ) {
            case "SUN":
                return SUN;
            case "MON":
                return MON;
            case "TUES":
                return TUES;
            case "WED":
                return WED;
            case "THURS":
                return THURS;
            case "FRI":
                return FRI;
            case "SAT":
                return SAT;
            default:
                return -1;
        }
    }

    /** Creates a Version1.Course, Adding it into List */
    public void createCourse() {
        Scanner reader = new Scanner(System.in); // <--TEMPORARY
        System.out.println("Enter Version1.Course ID: ");
        String courseID = reader.nextLine().strip();
        System.out.println("Enter Version1.Days Version1.Course is in Session: ");
        String[] sessionDaysSTRING = reader.nextLine().toUpperCase().strip().split(" ");
        int[] sessionDaysINDEX = new int[sessionDaysSTRING.length];
        for ( int i = 0 ; i < sessionDaysSTRING.length ; i++ ) {
            sessionDaysINDEX[i] = getDayIndex(sessionDaysSTRING[i]);
        }
        courses.add(new Course(courseID, sessionDaysINDEX));
    }

    /** Adds Version1.Course into SemesterCalendar */
    public void addOneCourse( Course course, int day, int week ) {
        calendar[day][week].addCourse(course);
    }

    /** Removes Version1.Course from SemesterCalendar */
    public void removeOneCourse( Course course, int day, int week ) {
        calendar[day][week].removeCourse(course);
    }

    /** USED FOR TESTING */
    public static void main( String[] args ) {
        SemesterCalendar calendar = new SemesterCalendar();
        calendar.createCourse();
        System.out.println("COURSES: " + calendar.courses);
        calendar.addOneCourse(calendar.courses.get(0), MON, 0);
        System.out.println(calendar.getDay(MON, 0));
        calendar.removeOneCourse(calendar.courses.get(0), MON, 0);
        System.out.println(calendar.getDay(MON, 0));
    }
}
