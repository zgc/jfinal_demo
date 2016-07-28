package com.hxgsn.demo;

import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zgc on 16-7-13.
 */
public class UserController extends Controller {

    public void index() {
        render("/user.html");
    }

    public void login() {
        String user = getPara("user");
        String password = getPara("password");

        //第一步，通过用户名获取用户，看用户是否存在
        String pwd = users.get(user);
        if (pwd == null) {
            redirect("/user");
            return;
        }

        if (pwd.equals(password)) {
            setCookie("user", user, 1000);
            redirect("/user/center");
            return;
        } else {
            redirect("/user");
            return;
        }
    }

    public void center() {
        String user = getCookie("user");
        if (user == null) {
            redirect("/user");
            return;
        }

        renderText(user + ",欢迎来到用户中心...");
    }

    static Map<String, String> users = new HashMap<>();

    static {
        users.put("test", "t");
        users.put("t", "test");
    }
}
