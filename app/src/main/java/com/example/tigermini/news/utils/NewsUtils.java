package com.example.tigermini.news.utils;

import android.content.Context;

import java.util.ArrayList;

import com.example.tigermini.news.R;
import com.example.tigermini.news.bean.NewsBean;

/**
 * Created by tiger on 2017/2/17.
 */

//封装新闻数据到ArrayList中
public class NewsUtils {
    public static ArrayList<NewsBean> getAllNews(Context context) {
        ArrayList<NewsBean> arrayList = new ArrayList<NewsBean>();
        for (int i = 0; i < 100; i++) {
            NewsBean newsBean1 = new NewsBean();
            newsBean1.title = "香港警察殴打“占中者”案：7名警察被判入狱2年";
            newsBean1.des = "【七港警殴打“占中者”案七名警察被判入狱两年】";
            newsBean1.news_url = "http://m2.people.cn/r/" +
                    "MV8wXzg0MjA3MDJfMjAzXzE0ODczMDI2Mjg=?tt_group_id=6387912742368067842";
            newsBean1.icon = context.getResources().getDrawable(R.drawable.news_1);
            arrayList.add(newsBean1);

            NewsBean newsBean2 = new NewsBean();
            newsBean2.title = "一张图教你科学消除狗狗泪痕！";
            newsBean2.des = "泰迪是比较娇贵的狗狗之一\n" +
                    "\n" +
                    "    狗狗出现泪痕是比较影响狗狗美观的\n" +
                    "\n" +
                    "    那泪痕真的木有办法消除吗？";
            newsBean2.news_url = "http://www.toutiao.com/a6387960651511595266/";
            newsBean2.icon = context.getResources().getDrawable(R.drawable.news_2);
            arrayList.add(newsBean2);

            NewsBean newsBean3 = new NewsBean();
            newsBean3.title = "三星掌门人李在镕被批捕 被控向朴槿惠和崔顺实行贿2.5亿";
            newsBean3.des = "据韩联社2月17日消息,韩国法院17日签发对三星电子副会长李在镕的逮捕证。" +
                    "这是三星成立以来掌门人第一次被批捕。" +
                    "韩国亲信门独立检察组计划以逮捕李在镕为契机,在剩下的调查时限内重点调查涉嫌受贿的总统朴槿惠。";
            newsBean3.news_url = "http://m.huanqiu.com/r/" +
                    "MV8wXzEwMTQ0ODk1XzEzOF8xNDg3MjgyNjQw?tt_group_id=6387814683538391298";
            newsBean3.icon = context.getResources().getDrawable(R.drawable.news_3);
            arrayList.add(newsBean3);

            NewsBean newsBean4 = new NewsBean();
            newsBean4.title = "如何把熟鸡蛋放在瓶子里，就是这么简单";
            newsBean4.des = "短视频";
            newsBean4.news_url = "http://www.toutiao.com/a6387922701301842434/";
            newsBean4.icon = context.getResources().getDrawable(R.drawable.news_4);
            arrayList.add(newsBean4);

            NewsBean newsBean5 = new NewsBean();
            newsBean5.title = "男朋友给我拍的照片，要不要和他分手？";
            newsBean5.des = "GIF图片";
            newsBean5.news_url = "http://www.toutiao.com/a6387950285226803458/";
            newsBean5.icon = context.getResources().getDrawable(R.drawable.news_5);
            arrayList.add(newsBean5);

        }
        return arrayList;
    }
}
