import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Calendar Class */
public class SemesterCalendar {
    /** Weeks */
    public final static int WEEKS = 16;

    /** Days */
    public final static int DAYS = 7;

    /** Calendar Array */
    public Day[][] calendar;

    /** List of Courses in the Semester */
    public List<Course> courses;

    /** Constructor --> Calendar */
    public SemesterCalendar() {
        this.calendar = new Day[DAYS][WEEKS];
        this.courses = new ArrayList<>();
        for ( int y = 0 ; y < WEEKS ; y++ ) {
            for ( int x = 0 ; x < DAYS ; x++ ) {
                calendar[x][y] = new Day(x, y);
            }
        }
    }

    /** Creates a Course, Adding it into List */
    public void createCourse() {
        Scanner reader = new Scanner(System.in); // <--TEMPORARY
        System.out.println("Enter Course ID: ");
        String courseID = reader.nextLine().strip();
        System.out.println("Enter Days Course is in Session: ");
        String[] sessionDaysSTRING = reader.nextLine().toUpperCase().strip().split(" ");
        List<Days> sessionDaysINDEX = new ArrayList<>();
        for ( String day : sessionDaysSTRING ) {
            switch ( day ) {
                case "SUN":
                    sessionDaysINDEX.add(Days.SUN);
                    break;
                case "MON":
                    sessionDaysINDEX.add(Days.MON);
                    break;
                case "TUES":
                    sessionDaysINDEX.add(Days.TUES);
                    break;
                case "WED":
                    sessionDaysINDEX.add(Days.WED);
                    break;
                case "THURS":
                    sessionDaysINDEX.add(Days.THURS);
                    break;
                case "FRI":
                    sessionDaysINDEX.add(Days.FRI);
                    break;
                case "SAT":
                    sessionDaysINDEX.add(Days.SAT);
                    break;
                default:
                    break;
            }
        }
    }

    /** Adds Course into Calendar */
    public void addCourse( Course course, int week, int day ) {
        calendar[day][week].addCourse(course);
    }

    /** Removes Course from Calendar */
    public void removeCourse( Course course, int week, int day ) {
        calendar[day][week].removeCourse(course);
    }

    /** USED FOR TESTING */
    public static void main( String[] args ) {
        SemesterCalendar calendar = new SemesterCalendar();
        calendar.createCourse();
    }
}
