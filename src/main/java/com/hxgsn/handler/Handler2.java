package com.hxgsn.handler;

import com.jfinal.handler.Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zgc on 16-8-8.
 */
public class Handler2 extends Handler {
    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, boolean[] isHandled) {
        System.out.println("Handler2 invoke!!! 	" + target);
        next.handle(target, request, response, isHandled);
    }
}
