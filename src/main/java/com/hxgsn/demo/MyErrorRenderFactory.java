package com.hxgsn.demo;

import com.jfinal.render.IErrorRenderFactory;
import com.jfinal.render.Render;
import com.jfinal.render.TextRender;

/**
 * Created by zgc on 16-7-21.
 */
public class MyErrorRenderFactory implements IErrorRenderFactory {

    @Override
    public Render getRender(int errorCode, String view) {
        return new TextRender("你好 jfinal，404 错误啦...");
    }
}
