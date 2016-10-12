package ca.ualberta.cs.lonelytwitter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.lang.String;

/**
 * The type Tweet.
 */
public abstract class Tweet implements Serializable{
    private String message;
    private Date date;
    private ArrayList<CurrentMood> moodList = new ArrayList<CurrentMood>();

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     */
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     * @param date    the date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;

    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     * @throws TweetToLongException the tweet to long exception
     */
    public void setMessage(String message) throws  TweetToLongException {
        if (message.length() > 140) {
            throw new TweetToLongException();
        } else {
            this.message = message;
        }
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

    /**
     * Add mood to tweet.
     *
     * @param mood the mood
     */
    public void addMoodToTweet(CurrentMood mood) {
        this.moodList.add(mood);
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

}
