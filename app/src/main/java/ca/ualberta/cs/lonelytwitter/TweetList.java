package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by drei on 2016-09-27.
 */
public class TweetList {
    /**
     * The Add.
     */
    public Object add;
    /**
     * The Tweets.
     */
    List<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Add tweet.
     *
     * @param tweet the tweet
     */
    public void addTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    /**
     * Gets tweet.
     *
     * @param i the
     * @return the tweet
     */
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    /**
     * Has tweet boolean.
     *
     * @param tweet the tweet
     * @return the boolean
     */
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    /**
     * Delete tweet.
     *
     * @param tweet the tweet
     */
    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    /**
     * Gets tweets.
     *
     * @return the tweets
     */
    public List<Tweet> getTweets() {
        return tweets;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public int getCount() {
        return tweets.size();
    }

    /**
     * Gets iterator.
     *
     * @return the iterator
     */
    public Iterator<Tweet> getIterator() {
        return tweets.iterator();
    }
}
