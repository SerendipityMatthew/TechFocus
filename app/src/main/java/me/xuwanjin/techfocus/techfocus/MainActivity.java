package me.xuwanjin.techfocus.techfocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.internal.BottomNavigationItemView;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    BottomNavigationItemView articleNavigationItem = null;
    BottomNavigationItemView meNavigationItem = null;
    BottomNavigationItemView newsNavigationItem = null;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        articleNavigationItem = (BottomNavigationItemView) findViewById(R.id.action_me);
        meNavigationItem = (BottomNavigationItemView) findViewById(R.id.article_list);
        newsNavigationItem = (BottomNavigationItemView) findViewById(R.id.rss_news);

    }
}
