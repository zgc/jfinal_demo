package com.hxgsn.handler;

import com.jfinal.handler.Handler;
import com.jfinal.kit.HandlerKit;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zgc on 16-8-8.
 */
public class Handler2 extends Handler {
    @Override
    public void handle(String target, HttpServletRequest request, HttpServletResponse response, boolean[] isHandled) {
        System.out.println("Handler2 invoke!!! 	" + target);
//        target = "/user";
//        System.out.println(">>>>:" + target);

        if (target.startsWith("/download")) {
//            HandlerKit.renderError404(request, response, isHandled);
            String user = (String) request.getSession().getAttribute("user");
            System.out.println("logined user:" + user);
            if (user == null) {
                HandlerKit.redirect("/user", request, response, isHandled);
                return;
            }
//            try {
//                response.sendRedirect("../user");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            isHandled[0] = true;
//            return;
        }
        next.handle(target, request, response, isHandled);
    }
}
