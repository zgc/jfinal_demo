package com.hxgsn.demo;

import com.jfinal.core.Controller;

import java.net.URLDecoder;

/**
 * Created by zgc on 16-7-13.
 */
public class IndexController extends Controller {

//    public int index() {
//        System.out.println("=====index=====");
//        renderText("this IndexController...");
//
//        return 0;
//    }

    public void index() {
//        String value1 = getPara("key1");
//
//        System.out.println("value1=====" + value1);
//        System.out.println("value2=====" + getPara("key2"));
//
//        String para = getPara();
//
//        System.out.println("para:" + para);
//        System.out.println("para0:" + getPara(0));
//        System.out.println("para1:" + getPara(1, "test"));
//        System.out.println("para2:" + URLDecoder.decode(getPara(2, "")));

//        int para2 = getParaToInt(2, 100);
//
//        System.out.println("para2:" + para2);

//        String title = getPara("title", "这是设置的默认标题");
//        String subtitle = getPara("subtitle");
//        String content = getPara("content");
//
//        System.out.println("title---->" + title);
//        System.out.println("subtitle---->" + subtitle);
//        System.out.println("content---->" + content);

        Article article = getBean(Article.class, "ar1");
//        Article article = getBean(Article.class, "");

        Article article1 = getModel(Article.class, "");

        System.out.println("title:" + article.getTitle());
        System.out.println("subtitle:" + article.getSubtitle());
        System.out.println("content:" + article.getContent());

        System.err.println(article);

        render("/index.html");
    }

//    public void jpress() {
//        System.out.println("xxxx");
//        renderText("x");
//    }
}
