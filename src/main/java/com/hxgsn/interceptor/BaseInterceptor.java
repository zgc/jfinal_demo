package com.hxgsn.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * Created by zgc on 16-8-17.
 */
public class BaseInterceptor implements Interceptor {
    @Override
    public void intercept(Invocation inv) {
        System.out.println(">>>>>>:interceptor-base");
//        inv.invoke();
        if ("/user".equals(inv.getActionKey())) {
            inv.invoke();
            return;
        }
        inv.getController().redirect("/user");
    }
}
