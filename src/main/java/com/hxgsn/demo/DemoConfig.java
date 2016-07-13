package com.hxgsn.demo;

import com.jfinal.config.*;

/**
 * Created by zgc on 16-7-13.
 */
public class DemoConfig extends JFinalConfig {

    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
        me.add("/", IndexController.class);
    }

    public void configPlugin(Plugins me) {
    }

    public void configInterceptor(Interceptors me) {
    }

    public void configHandler(Handlers me) {
    }
}

