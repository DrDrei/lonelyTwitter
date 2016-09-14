package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by drei on 2016-09-13.
 */
public class HappyMood extends CurrentMood implements Moodable {
    private String mood = "Happy Mood";

    public HappyMood() {
        super();
    }

    public HappyMood(Date date) {
        super(date);
    }

    @Override
    public String moodType() {
        return mood;
    }

}
