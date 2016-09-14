package ca.ualberta.cs.lonelytwitter;

/**
 * Created by drei on 2016-09-13.
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

