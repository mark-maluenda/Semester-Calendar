/** Calendar Class */
public class Calendar {
    /** Weeks */
    public final static int WEEKS = 16;

    /** Days */
    public final static int DAYS = 7;

    /** Calendar Array */
    public Day[][] calendar;

    /** Constructor --> Calendar */
    public Calendar() {
        this.calendar = new Day[DAYS][WEEKS];
        for ( int y = 0 ; y < WEEKS ; y++ ) {
            for ( int x = 0 ; x < DAYS ; x++ ) {
                calendar[x][y] = new Day(x, y);
            }
        }
    }

    /** Adds Course into Calendar */
    public void addCourse( String courseID, int[] sessionDays ) {
        Course course = new Course(courseID, sessionDays);
        // Go through each day this course is scheduled, adds course into day
        for ( int i = 0 ; i < sessionDays.length ; i++ ) {
            // Go through each week in calendar
            for ( int y = 0 ; y < WEEKS ; y++ ) {
                // Go through each day in week
                for ( int x = 0 ; x < DAYS ; x++ ) {
                    // If a session day matches with the day, add course
                    if ( sessionDays[i] == x ) {
                        calendar[x][y].addCourse(course);
                    }
                }
            }
        }
    }

    /** Removes Course from Calendar */
    public void removeCourse( String courseID ) {
        for ( int y = 0 ; y < WEEKS ; y++ ) {
            for ( int x = 0 ; x < DAYS ; x++ ) {
                if ( calendar[x][y].findCourse(courseID).getCourseID().equals(courseID) ) {
                    removeCourse(courseID);
                }
            }
        }
    }

    /** USED FOR TESTING */
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        String courseID = "SWEN250";
        int[] sessionDays = {1, 3, 5};
        calendar.addCourse(courseID, sessionDays);
    }
}
