package me.xuwanjin.techfocus.techfocus;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ArticleAdapter extends ArrayAdapter<Article> {
    public static final String TAG = "ArticleAdapter";
    private int resourceId = 0;

    public ArticleAdapter(@NonNull Context context, int resource, List<Article> articleList) {
        super(context, resource);
        resourceId = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Log.d(TAG, "getView: ");
        Article article = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.favorite_article_list, null);
            viewHolder = new ViewHolder();
            viewHolder.articleImage = (ImageView) view.findViewById(R.id.article_image);
            viewHolder.articleSummary = (TextView) view.findViewById(R.id.article_summary);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.articleImage.setImageResource(R.mipmap.ic_launcher);
        viewHolder.articleSummary.setText(article.getArticleSummary());
        return super.getView(position, convertView, parent);
    }

    @Nullable
    @Override
    public Article getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public int getPosition(@Nullable Article item) {
        return super.getPosition(item);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    class ViewHolder {
        ImageView articleImage;
        TextView articleSummary;
    }
}
