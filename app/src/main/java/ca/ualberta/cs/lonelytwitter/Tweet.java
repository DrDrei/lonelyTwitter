package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;
import java.lang.String;

/**
 * Created by drei on 2016-09-13.
 */
public abstract class Tweet {
    private String message;
    private Date date;
    private ArrayList<CurrentMood> moodList = new ArrayList<CurrentMood>();
    public abstract Boolean isImportant();

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws  TweetToLongException {
        if (message.length() > 140) {
            throw new TweetToLongException();
        } else {
            this.message = message;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void addMoodToTweet(CurrentMood mood) {
        this.moodList.add(mood);
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

}
