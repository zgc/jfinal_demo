package com.hxgsn.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zgc on 17-6-18.
 */
public class CglibEnhancer {

    public static Object getService(Class<?> clazz) {
        return Enhancer.create(clazz, (MethodInterceptor) (o, method, objects, methodProxy) -> {
//            System.out.println("method:" + method);
//            System.out.println("objects:" + objects);
//            System.out.println("objects[0]:" + objects[0]);
//            return methodProxy.invokeSuper(o, objects);
            if ("addUser".equals(method.getName())) {
                System.out.println("准备相关资料");
            }
            Object object = methodProxy.invokeSuper(o, objects);
            if ("addUser".equals(method.getName())) {
                System.out.println("通知各个模块");
            }
            return object;
        });
    }
}
