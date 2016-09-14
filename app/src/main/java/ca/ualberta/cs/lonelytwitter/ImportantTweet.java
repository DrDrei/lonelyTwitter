package ca.ualberta.cs.lonelytwitter;

/**
 * Created by drei on 2016-09-13.
 */
public class ImportantTweet extends Tweet implements Moodable {
    public ImportantTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

}
