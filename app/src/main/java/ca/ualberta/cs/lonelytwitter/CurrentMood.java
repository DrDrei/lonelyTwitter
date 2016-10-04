package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * The type Current mood.
 */
public abstract class CurrentMood {

    private Date date;

    /**
     * Mood type string.
     *
     * @return the string
     */
    public abstract String moodType();

    /**
     * Instantiates a new Current mood.
     */
    public CurrentMood() {
        this.date = new Date();
    }

    /**
     * Instantiates a new Current mood.
     *
     * @param date the date
     */
    public CurrentMood(Date date) {
        this.date = date;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
