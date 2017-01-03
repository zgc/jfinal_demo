package com.hxgsn.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zgc on 17-1-3.
 */
public class Enhancer {

  public static Object getService(Class<UserServiceInterface> clazz) {
//    return new UserServiceImplProxy();
    return Proxy
        .newProxyInstance(ProxyTest.class.getClassLoader(), new Class[]{clazz},
            new UserServiceInvocation());
  }

  static class UserServiceInvocation implements InvocationHandler {

    UserServiceImpl userService;

    public UserServiceInvocation() {
      userService = new UserServiceImpl();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//      System.out.println("method ========== " + method.getName());
      if ("addUser".equals(method.getName())) {
        System.out.println("准备相关资料");
      }
      Object object = method.invoke(userService, args);
      if ("addUser".equals(method.getName())) {
        System.out.println("通知各个模块");
      }
      return object;
    }
  }
}
