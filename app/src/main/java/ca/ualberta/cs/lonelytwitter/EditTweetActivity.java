package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EditTweetActivity extends Activity {

    private ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
    private ListView oldTweetsList;
    private ArrayAdapter<Tweet> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        grabTweet();
        oldTweetsList = (ListView) findViewById(R.id.editlist);
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        adapter = new ArrayAdapter<Tweet>(this,
                R.layout.list_item, tweetList);
        oldTweetsList.setAdapter(adapter);
    }

    private void grabTweet() {
        Intent intent = getIntent();
        Tweet tweet = (Tweet) intent.getSerializableExtra("tweet");
        tweetList.add(tweet);
    }
}
