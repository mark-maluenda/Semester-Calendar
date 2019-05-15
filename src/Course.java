/** Course that is unique to other courses */
public class Course {
    /** Course ID */
    public String courseID;

    /** Days of Sessions */
    public int[] sessionDays;

    /** Constructor --> Course */
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
}
