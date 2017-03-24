package com.example.tigermini.news;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.example.tigermini.news.adaptor.NewsAdaptor;
import com.example.tigermini.news.bean.NewsBean;
import com.example.tigermini.news.utils.NewsUtils;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private Context mcontext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcontext=this;
        //1.找到listview控件
        ListView lv_news =  (ListView) findViewById(R.id.lv_news);
        //2.获取新闻数据，用list封装
        ArrayList<NewsBean> allNews = NewsUtils.getAllNews(mcontext);
        //3.创建一个adaptor设置给listview
        NewsAdaptor newsAdaptor = new NewsAdaptor(mcontext, allNews);
        lv_news.setAdapter(newsAdaptor);

        //4.设置条目的点击事件
        lv_news.setOnItemClickListener(this);
    }

    //listView条目点击时调用
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        NewsBean bean = (NewsBean) parent.getItemAtPosition(position);
        String news_url = bean.news_url;

        //跳转浏览器
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(news_url));
        startActivity(intent);

    }
}
