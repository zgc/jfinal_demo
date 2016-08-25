package com.hxgsn.interceptor;

import com.jfinal.aop.Invocation;

/**
 * Created by zgc on 16-8-17.
 */
public class Interceptor1 extends BaseInterceptor {
    @Override
    public void intercept(Invocation inv) {
        System.out.println(">>>>>>:interceptor-1");
//        if ("/login".equals(inv.getActionKey())) {
//            inv.invoke();
//            return;
//        }
//        String user = null;
//        if (user == null) {
//            inv.getController().redirect("/login");
//            return;
//        } else {
//            inv.invoke();
//        }
//        inv.getController().redirect("/user");
        inv.invoke();
    }
}
