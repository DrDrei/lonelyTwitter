package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by drei on 2016-09-13.
 */
public class Tweet {
    private String message;
    private Date date;

    public Tweet(String message) {
        this.message = message;
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
}
