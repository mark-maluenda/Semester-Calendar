package Version1;

import java.util.ArrayList;

/** Version1.Course that is unique to other courses */
public class Course {
    /** Version1.Course ID */
    public String courseID;

    /** Version1.Days of Sessions */
    public int[] sessionDays;

    /** Constructor --> Version1.Course */
    public Course( String courseID, int[] sessionDays ) {
        this.courseID = courseID;
        this.sessionDays = new int[sessionDays.length];
        for ( int i = 0 ; i < sessionDays.length ; i++ ) {
            this.sessionDays[i] = sessionDays[i];
        }
    }

    /** Getter --> courseID */
    public String getCourseID() {
        return courseID;
    }

    /** toString */
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("COURSE { courseID="+ courseID + " sessionDays=[");
        for ( int i = 0 ; i < sessionDays.length ; i++ ) {
            if ( sessionDays[i] == 0 ) {
                string.append("SUN");
            } else if ( sessionDays[i] == 1 ) {
                string.append("MON");
            } else if ( sessionDays[i] == 2 ) {
                string.append("TUES");
            } else if ( sessionDays[i] == 3 ) {
                string.append("WED");
            } else if ( sessionDays[i] == 4 ) {
                string.append("THURS");
            } else if ( sessionDays[i] == 5 ) {
                string.append("FRI");
            } else if ( sessionDays[i] == 6 ) {
                string.append("SAT");
            }
            if ( i < sessionDays.length - 1) {
                string.append(", ");
            } else {
                string.append("]");
            }
        }
        string.append(" }");
        return string.toString();
    }
}
