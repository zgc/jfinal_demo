package com.hxgsn.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * Created by zgc on 16-8-17.
 */
public class Interceptor3 implements Interceptor {
    @Override
    public void intercept(Invocation inv) {
        System.out.println(">>>>>>:interceptor-3");
        inv.invoke();
    }
}
