package com.hxgsn.controller;

import com.jfinal.core.Controller;

/**
 * Created by zgc on 16-7-24.
 */
public class TestController extends Controller {

    public void index() {
//        renderText("test controller...");
        render("test.ftl");//如果以/开头，会去webapp目录下面找
    }
}
