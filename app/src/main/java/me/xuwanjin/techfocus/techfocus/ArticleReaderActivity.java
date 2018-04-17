package me.xuwanjin.techfocus.techfocus;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ArticleReaderActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_show_activity);
        ListView listView = (ListView) findViewById(R.id.article_content_index);
        FrameLayout mainContent = (FrameLayout) findViewById(R.id.main_content_frame);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.article_content);
        List<String> strings = new ArrayList<>();
        strings.add("xuwanjin");
        strings.add("xuwanjin1");
        strings.add("xuwanjin2");
        strings.add("xuwanjin3");
        ArticleIndexAdapter articleIndexAdapter = new ArticleIndexAdapter(getApplicationContext(),
                strings);
        listView.setAdapter(articleIndexAdapter);
    }
}
