package com.hxgsn.interceptor;

import com.jfinal.aop.Invocation;

/**
 * Created by zgc on 16-8-17.
 */
public class Interceptor1 extends BaseInterceptor {
    @Override
    public void intercept(Invocation inv) {
        System.out.println(">>>>>>:interceptor-1");
//        inv.invoke();
        if ("/user".equals(inv.getActionKey())) {
            inv.invoke();
            return;
        }
        inv.getController().redirect("/user");
    }
}
