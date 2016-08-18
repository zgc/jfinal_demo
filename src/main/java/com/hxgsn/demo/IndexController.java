package com.hxgsn.demo;

import com.hxgsn.interceptor.Interceptor1;
import com.hxgsn.interceptor.Interceptor2;
import com.hxgsn.interceptor.Interceptor3;
import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;
import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;

import java.net.URLDecoder;

/**
 * Created by zgc on 16-7-13.
 */
//@Clear(Interceptor1.class)
@Before(Interceptor2.class)
public class IndexController extends Controller {

//    public int index() {
//        System.out.println("=====index=====");
//        renderText("this IndexController...");
//
//        return 0;
//    }

    //    @Clear(Interceptor1.class)
//    @Before(Interceptor2.class)
//    public void index() {
//        String value1 = getPara("key1");
//
//        System.out.println("value1=====" + value1);
//        System.out.println("value2=====" + getPara("key2"));
//
//        String para = getPara();
//
//        System.out.println("para:" + para);
//        System.out.println("para0:" + getPara(0));
//        System.out.println("para1:" + getPara(1, "test"));
//        System.out.println("para2:" + URLDecoder.decode(getPara(2, "")));

//        int para2 = getParaToInt(2, 100);
//
//        System.out.println("para2:" + para2);

//        String title = getPara("title", "这是设置的默认标题");
//        String subtitle = getPara("subtitle");
//        String content = getPara("content");
//
//        System.out.println("title---->" + title);
//        System.out.println("subtitle---->" + subtitle);
//        System.out.println("content---->" + content);

//        Article article = getBean(Article.class, "ar1");
//        Article article = getBean(Article.class, "");

//        Article article1 = getModel(Article.class, "");
//
//        System.out.println("title:" + article.getTitle());
//        System.out.println("subtitle:" + article.getSubtitle());
//        System.out.println("content:" + article.getContent());
//
//        System.err.println(article);

//        getRequest();
//        getResponse();

//        String ua = getRequest().getHeader("User-Agent");
//        System.out.println(">>>>:" + ua);

//        getResponse().setHeader("test", "test");

    //getSessionAttr内部先去获取浏览器提交的cookie，key：JSESSIONID == 随机字符串
    //通过JSESSIONID找到MAP，然后再去这个map里获得user的值
//        String user = getSessionAttr("user");
//        System.out.println("user >>>>>>" + user);
//
//        render("/index.ftl");
//        System.out.println(">>>>>>:IndexController-index");
//        renderText("index...");
//    }

//    @Before(Interceptor1.class)
//    public void index2() {
//        System.out.println(">>>>>>:IndexController-index");
//        renderText("index2...");
//    }

    public void action1() {
        System.out.println(">>>>>>:IndexController-action1");
        renderText("action1...");
    }

    public void action2() {
        System.out.println(">>>>>>:IndexController-action2");
        renderText("action2...");
    }

    @Before({Interceptor3.class})
    public void action3() {
        System.out.println(">>>>>>:IndexController-action3");
        renderText("action3...");
    }

    @Clear({Interceptor1.class, Interceptor2.class})
    public void action4() {
        System.out.println(">>>>>>:IndexController-action4");
        renderText("action4...");
    }

//    public void upload() {
    //调用getFile，必须是multipart/form-data
    //文件大小的限制可能会出错，通过config的setMaxPostSize去设置允许上传的最大数据
    //getFile必须依赖com.jfinal.cos
    //默认使用第一个实例化的UploadFile
//        getFile();
//        UploadFile sfzfile = getFile("sfz");
//        UploadFile ufile = getFile("tx", "touxiang");

    //当有其它form提交的时候，先调用getFile解析MultipartRequest，才能调用getPara接受参数
//        String title = getPara("title");
//        System.out.println("=====title:" + title);
//
//        renderText("upload....");
//    }

//    public void jpress() {
//        System.out.println("xxxx");
//        renderText("x");
//    }

//    public void cookie() {
//        String username = getPara("user");
//        String password = getPara("pwd");
//
//        if ("test".equals(username) && "t".equals(password)) {
//            setCookie("user", "test", 60 * 60 * 24);
    //设置session，给客户端颁发了一个通行证：JSESSIONID：随机字符串
    //同时设置了一个MAP,通过 随机字符串 对应到 >>> map
//            setSessionAttr("user", "test");
//        }
//        else {
//            removeCookie("user");
//        }

//        if ("t".equals(username) && "test".equals(password)) {
//            setSessionAttr("user", "t");
//        }
//        renderText("ok >>>");
//    }
}
