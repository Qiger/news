package com.example.tigermini.news.adaptor;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tigermini.news.R;
import com.example.tigermini.news.bean.NewsBean;

import java.util.ArrayList;

/**
 * Created by tiger on 2017/2/17.
 */

public class NewsAdaptor extends BaseAdapter {
    private final Context context;
    private ArrayList<NewsBean> list;

    //通过构造方法显示新闻数据的集合
    public NewsAdaptor(Context context,ArrayList<NewsBean> list) {
        this.list=list;
        this.context=context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=null;
        //复用convertView,优化listView,创建一个view作为getview返回值来显示条目
        if(convertView!=null){
            view=convertView;
        }else {
            view = View.inflate(context, R.layout.item_news_layout, null);
        }

        //2.获取view上的子控件对象
        TextView tv_item_title = (TextView) view.findViewById(R.id.tv_item_title);
        TextView tv_item_des = (TextView) view.findViewById(R.id.tv_item_des);
        ImageView iv_img_icon = (ImageView) view.findViewById(R.id.iv_img_icon);
        //3.获取position位置条目对应的list集合中的新闻数据
        NewsBean newsBean = list.get(position);


        //4.将数据设置给这些子控件做显示
        tv_item_title.setText(newsBean.title);
        tv_item_des.setText(newsBean.des);
        iv_img_icon.setImageDrawable(newsBean.icon);

        return view;
    }
}
