/** Course that is unique to other courses */
public class Course {
    /** Course ID */
    public String courseID;

    /** Days of Sessions */
    public Days[] sessionDays;

    /** Constructor --> Course */
    public Course( String courseID, Days[] sessionDays ) {
        this.courseID = courseID;
        this.sessionDays = new Days[sessionDays.length];
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
        string.append( courseID + "[");
        for ( int i = 0 ; i < sessionDays.length ; i++ ) {
            string.append(" " + sessionDays[i]);
        }
        string.append("]");
        return string.toString();
    }
}
