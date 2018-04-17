package me.xuwanjin.techfocus.techfocus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ArticleIndexAdapter extends BaseAdapter {
    private Context mContext;
    private List<String> stringList;

    public ArticleIndexAdapter() {

    }

    public ArticleIndexAdapter(Context context, List<String> strings) {
        this.mContext = context;
        this.stringList = strings;
    }

    @Override
    public int getCount() {
        return stringList != null ? stringList.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return stringList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.article_index_list, null);
            viewHolder.textView= (TextView) convertView.findViewById(R.id.article_main_content);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textView.setText(stringList.get(position));
        return convertView;
    }

    class ViewHolder {
        public TextView textView;
    }


}
