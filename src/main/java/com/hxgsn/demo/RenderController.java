package com.hxgsn.demo;

import com.jfinal.core.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zgc on 16-7-31.
 */
public class RenderController extends Controller {

    public void index() {
        //render/index.ftl
//        renderError(404);
//        renderText("hi");
//        renderText("hi,test!");
//        renderHtml("hello");
//        renderXml("hello,test!");
//        renderJavascript("test");
        render("/user.ftl");
    }

    public void uindex() {
//        List<String> articles = new ArrayList<>();
//        articles.add("test1");
//        articles.add("test2");
//        articles.add("test3");
//        articles.add("test4");
//        articles.add("test5");
//        articles.add("test6");
//        articles.add("test7");
//        articles.add("test8");
//        articles.add("test9");

        List<String> users = new ArrayList<>();
        users.add("u1");
        users.add("u2");
        users.add("u3");
        users.add("u4");
        users.add("u5");
        users.add("u6");
        users.add("u7");
        users.add("u8");
        users.add("u9");

//        setAttr("articles", articles);
        setAttr("users", users);

        render("/user_index.ftl");
    }

    public void ucat() {
        render("/user_cat.ftl");
    }
}
