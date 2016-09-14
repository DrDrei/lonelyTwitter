package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by drei on 2016-09-13.
 */
public class AngryMood extends CurrentMood {
    private String mood = "Angry Mood";

    public AngryMood() {
        super();
    }

    public AngryMood(Date date) {
        super(date);
    }

    @Override
    public String moodType() {
        return mood;
    }
}
