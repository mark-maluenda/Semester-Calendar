public enum Days {
    SUN, MON, TUES, WED, THURS, FRI, SAT;

    /** Returns Day Index */
    public int getIndex( Days day ) {
        if ( day == SUN ) {
            return 0;
        } else if ( day == MON ) {
            return 1;
        } else if ( day == TUES ) {
            return 2;
        } else if ( day == WED ) {
            return 3;
        } else if ( day == THURS ) {
            return 4;
        } else if ( day == FRI ) {
            return 5;
        } else if ( day == SAT ) {
            return 6;
        } else {
            return -1;
        }
    }

    /** toString */
    public String toString( Days day ) {
        if ( day == SUN ) {
            return "SUN";
        } else if ( day == MON ) {
            return "MON";
        } else if ( day == TUES ) {
            return "TUES";
        } else if ( day == WED ) {
            return "WED";
        } else if ( day == THURS ) {
            return "THURS";
        } else if ( day == FRI ) {
            return "FRI";
        } else if ( day == SAT ) {
            return "SAT";
        } else {
            return "NONE";
        }
    }
}
