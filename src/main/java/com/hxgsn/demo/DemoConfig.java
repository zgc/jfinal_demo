package com.hxgsn.demo;

import com.jfinal.config.*;
import com.jfinal.render.ViewType;

/**
 * Created by zgc on 16-7-13.
 */
public class DemoConfig extends JFinalConfig {

    public void configConstant(Constants me) {
        me.setDevMode(true);
        me.setBaseDownloadPath("download");//设置文件渲染的默认路径
        me.setBaseUploadPath("upload");//设置文件上传的默认路径
//        me.setBaseViewPath("");//设置路由视图的默认路径
//        me.setEncoding("utf-8");//设置jfinal编码
//        me.setError401View("");//设置401错误的视图
        me.setError404View("404.html");//设置404错误的视图
        me.setErrorRenderFactory(new MyErrorRenderFactory());//设置错误视图工厂
//        me.setErrorView(401,"");//设置401错误的视图
//        me.setFreeMarkerTemplateUpdateDelay(0);//设置freemarker模板引擎的更新时间
//        me.setFreeMarkerViewExtension("");//设置freemarker的默认后缀，默认.html
//        me.setI18nDefaultBaseName("");//设置国际化的默认名称
//        me.setI18nDefaultLocale("");//设置国际化默认的语言
//        me.setJsonFactory(null);//设置json工厂
//        me.setJspViewExtension("");//设置jsp的默认后缀，默认.html
//        me.setMainRenderFactory(null);//设置渲染视图类
        me.setMaxPostSize(1024 * 1024 * 100);//设置post请求大小
        me.setReportAfterInvocation(false);//设置log打印顺序
//        me.setTokenCache(null);//设置token缓存
//        me.setUrlParaSeparator("-");//设置url参数分割符
//        me.setVelocityViewExtension("");//设置velocity的默认后缀，默认.html
//        me.setViewType(ViewType.FREE_MARKER);//设置视图类型
//        me.setXmlRenderFactory(null);//设置xml渲染器工程

    }

    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
        me.add("/", IndexController.class);

        me.add("/test", TestController.class, "test/index");
    }

    public void configPlugin(Plugins me) {
    }

    public void configInterceptor(Interceptors me) {
    }

    public void configHandler(Handlers me) {
//        me.add(handler);
    }
}