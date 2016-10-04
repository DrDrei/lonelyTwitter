package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The type Happy mood.
 */
public class HappyMood extends CurrentMood {
    private String mood = "Happy Mood";

    /**
     * Instantiates a new Happy mood.
     */
    public HappyMood() {
        super();
    }

    /**
     * Instantiates a new Happy mood.
     *
     * @param date the date
     */
    public HappyMood(Date date) {
        super(date);
    }

    @Override
    public String moodType() {
        return mood;
    }

}
