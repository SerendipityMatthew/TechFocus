package me.xuwanjin.techfocus.techfocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.internal.BottomNavigationItemView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    BottomNavigationItemView articleNavigationItem = null;
    BottomNavigationItemView meNavigationItem = null;
    BottomNavigationItemView newsNavigationItem = null;
    public static final String TAG = "MainActivity";
    public static List<Article> articleList = null;
    public ListView articleListView = null;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initArticleList();
        articleListView = (ListView) findViewById(R.id.article_list);
    /*    articleNavigationItem = (BottomNavigationItemView) findViewById(R.id.action_me_navig);
        meNavigationItem = (BottomNavigationItemView) findViewById(R.id.article_list_navig);
        newsNavigationItem = (BottomNavigationItemView) findViewById(R.id.rss_news_navig);*/
        ArrayAdapter<Article> arrayAdapter =
                new ArticleAdapter(MainActivity.this, R.layout.activity_main, articleList);
        articleListView.setAdapter(arrayAdapter);
    }

    private void initArticleList() {
        Log.d(TAG, "initArticleList: ");
        articleList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Article article = new Article();
//            article.setArticleMainImage(R.drawable.ic_launcher);
//            R.drawable.ic_launcher;
//            article.setArticleImage();
            article.setArticleSummary(getResources().getString(R.string.article_text_sample));

        }
    }

}
