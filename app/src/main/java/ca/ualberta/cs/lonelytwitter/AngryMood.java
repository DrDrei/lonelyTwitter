package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * The type Angry mood extends CurrentMood
 */
public class AngryMood extends CurrentMood {
    private String mood = "Angry Mood";

    /**
     * Instantiates a new Angry mood.
     */
    public AngryMood() {
        super();
    }

    /**
     * Instantiates a new Angry mood.
     *
     * @param date the date
     */
    public AngryMood(Date date) {
        super(date);
    }

    @Override
    public String moodType() {
        return mood;
    }
}
