package com.hxgsn.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * Created by zgc on 17-1-3.
 */
public class AOPInterceptor implements Interceptor {

  @Override
  public void intercept(Invocation inv) {
    System.out.println("AOPInterceptor invoke!!!");
    inv.invoke();
  }
}
