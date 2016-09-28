package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.Iterator;

/**
 * Created by drei on 2016-09-27.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello!");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello!");
        assertFalse(list.hasTweet(tweet));
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello!");
        Tweet tweet2 = new NormalTweet("Hi!");
        list.addTweet(tweet);
        list.addTweet(tweet2);

        assertEquals(tweet, list.getTweet(0));
        assertEquals(tweet2, list.getTweet(1));
    }

    public void testDeleteTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello!");
        Tweet tweet2 = new NormalTweet("Hi!");

        list.addTweet(tweet);

        assertTrue(list.hasTweet(tweet));
        list.deleteTweet(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    public void testTweets() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello!");
        Tweet tweet2 = new NormalTweet("Hi!");
        Tweet tweet3 = new NormalTweet("Yo!");
        list.addTweet(tweet);
        list.addTweet(tweet2);
        list.addTweet(tweet3);
        Integer index = 0;
        Iterator iter = list.getIterator();
        for(Iterator<Tweet> each = list.getIterator(); each.hasNext();) {
            assertEquals(each.next(), list.getTweets().get(index));
            index += 1;
        }
    }

    public void testTweetCount() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello!");
        Tweet tweet2 = new NormalTweet("Hi!");
        Tweet tweet3 = new NormalTweet("Yo!");
        list.addTweet(tweet);
        list.addTweet(tweet2);
        list.addTweet(tweet3);
        assertEquals(3, list.getCount());
    }
}
