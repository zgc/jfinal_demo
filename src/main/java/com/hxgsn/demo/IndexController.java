package com.hxgsn.demo;

import com.jfinal.core.Controller;

/**
 * Created by zgc on 16-7-13.
 */
public class IndexController extends Controller {

    public void index() {
        renderText("this IndexController...");
    }
}
