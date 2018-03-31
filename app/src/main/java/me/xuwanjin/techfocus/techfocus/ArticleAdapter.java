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
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ArticleAdapter extends BaseAdapter {
    public static final String TAG = "ArticleAdapter";
    private List<Article> articleList;
    private Context mContext;
    private LayoutInflater inflater;

    public ArticleAdapter() {
    }

    public ArticleAdapter(List<Article> articleList, Context context) {
        this.mContext = context;
        this.articleList = articleList;
        this.inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Log.d(TAG, "getView: ");
        Article article = getItem(position);
        View view = null;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = inflater.inflate(R.layout.favorite_article_list, null);
            viewHolder = new ViewHolder();
            viewHolder.articleImage = (ImageView) view.findViewById(R.id.article_image);
            viewHolder.articleSummary = (TextView) view.findViewById(R.id.article_summary);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        if (article != null && article.getArticleSummary() != null) {
            viewHolder.articleSummary.setText(article.getArticleSummary());
        }
        return view;
    }

    @Override
    public int getCount() {
        return articleList == null ? 0 : articleList.size();
    }

    @Nullable
    @Override
    public Article getItem(int position) {
        return articleList.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    class ViewHolder {
        ImageView articleImage;
        TextView articleSummary;
    }
}
