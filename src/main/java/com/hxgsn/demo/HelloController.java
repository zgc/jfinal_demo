package com.hxgsn.demo;

import com.jfinal.core.Controller;

/**
 * Created by zgc on 16-7-13.
 */
public class HelloController extends Controller {

    public void index() {
//        renderText("Hello JFinal World.");

//        Data data = new Data();
//        data.setAge(10);
//        data.setName("JFinal");

//        renderJson(data);
//        renderText("hello index!!!");
        System.out.println("=====index=====");
        render("/hello.html");
    }

    public void test() {
        renderText("test ...");
    }

    public void download(){
        renderFile("jfinal_demo");
    }
}
