package com.hxgsn.handler;

import com.jfinal.handler.Handler;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zgc on 16-8-8.
 */
public class Handler1 extends Handler {
    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, boolean[] isHandled) {
        System.out.println("Handler1 invoke!!! \t" + target);
//        next.handle(target, request, response, isHandled);
//        try {
//            response.getWriter().write("Handler1 invoke!!!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                response.getWriter().close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        // target = /index.html
//        isHandled[0] = true;
        if (target.endsWith(".html")) {
            target = target.substring(0, target.lastIndexOf("."));
        }
        System.out.println("substring target:" + target);
        next.handle(target, request, response, isHandled);
    }
}
