package com.hxgsn.render.freemarker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zgc on 16-7-31.
 */
public class ArticlesTag extends JTag {

    @Override
    public void onRender() {
        List<String> articles = new ArrayList<>();
        articles.add("test1");
        articles.add("test2");
        articles.add("test3");
        articles.add("test4");
        articles.add("test5");
        articles.add("test6");
        articles.add("test7");
        articles.add("test8");
        articles.add("test9");

        setVariable("articles", articles);
        renderBody();
    }
}
