package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by drei on 2016-09-13.
 */

public abstract class CurrentMood {
    private Date date;
    public abstract String moodType();

    public CurrentMood() {
        this.date = new Date();
    }

    public CurrentMood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
