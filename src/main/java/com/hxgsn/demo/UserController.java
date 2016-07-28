package com.hxgsn.demo;

import com.jfinal.core.Controller;
import com.jfinal.kit.HashKit;
import com.jfinal.upload.UploadFile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zgc on 16-7-13.
 */
public class UserController extends Controller {

    private static final String sha512_pwd = "test";

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
            String cookieinfo = user + "#" + HashKit.sha512(user + sha512_pwd);
            setCookie("user", cookieinfo, 1000, true);
            redirect("/user/center");
            return;
        } else {
            redirect("/user");
            return;
        }

        //username#md5(username);
    }

    public void center() {
//        String user = getCookie("user");

        String cookieinfo = getCookie("user");

        if (cookieinfo == null) {
            redirect("/user");
            return;
        }

        String user = cookieinfo.split("#")[0];
        String sha512 = cookieinfo.split("#")[1];

        if (HashKit.sha512(user + sha512_pwd).equals(sha512)) {
            System.out.println(">>>>> 合法的用户");
            renderText(user + ",欢迎来到用户中心...");
        } else {
            System.out.println(">>>>> 非法的用户");
            renderText(user + ",你是非法用户！！！！");
        }
        //username#md5(username); #user
    }

    static Map<String, String> users = new HashMap<>();

    static {
        users.put("test", "t");
        users.put("t", "test");
    }
}
