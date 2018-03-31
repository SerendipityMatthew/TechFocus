package me.xuwanjin.techfocus.techfocus;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.internal.BottomNavigationItemView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    BottomNavigationItemView articleNavigationItem = null;
    BottomNavigationItemView meNavigationItem = null;
    BottomNavigationItemView newsNavigationItem = null;
    public static final String TAG = "MainActivity";
    public static List<Article> articleList = null;
    public ListView articleListView = null;
    ViewPager viewPager = null;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initArticleList();
        articleNavigationItem = (BottomNavigationItemView) findViewById(R.id.article_list_navig);
        meNavigationItem = (BottomNavigationItemView) findViewById(R.id.action_me_navig);
        newsNavigationItem = (BottomNavigationItemView) findViewById(R.id.rss_news_navig);
        articleNavigationItem.setOnClickListener(this);


    }

    private void initArticleList() {
        Log.d(TAG, "initArticleList: ");
        articleList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Article article = new Article();
            article.setArticleSummary(getResources().getString(R.string.article_text_sample));
            articleList.add(article);

        }
    }

    @Override
    public void onClick(View view) {
        if (view == articleNavigationItem) {
            Toast.makeText(this, "xxxxxxx", Toast.LENGTH_SHORT).show();
            LayoutInflater layoutInflater = getLayoutInflater();
            View mainPageView = layoutInflater.inflate(R.layout.main_view_pager_one, null, false);
            List<View> viewList = new ArrayList<>();
            viewList.add(mainPageView);
            BaseAdapter baseAdapter =
                    new ArticleAdapter(articleList, this);

            viewPager = (ViewPager) findViewById(R.id.main_viewpager);
            MainViewPager mainViewPager = new MainViewPager(viewList);
            articleListView = (ListView) mainPageView.findViewById(R.id.article_list);
            articleListView.setAdapter(baseAdapter);
            viewPager.setAdapter(mainViewPager);
        }else if(view == meNavigationItem){

        }else if (view == newsNavigationItem){

        }
    }
}
