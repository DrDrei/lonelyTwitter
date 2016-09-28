package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by drei on 2016-09-27.
 */
public class TweetList {
    public Object add;
    List<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public int getCount() {
        return tweets.size();
    }

    public Iterator<Tweet> getIterator() {
        return tweets.iterator();
    }
}
