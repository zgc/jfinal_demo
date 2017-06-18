package com.hxgsn.proxy;

import com.jfinal.aop.Duang;
import com.jfinal.aop.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zgc on 17-1-3.
 */
public class ProxyTest {

    public static void main(String[] args) {

//        Enhancer
//        Duang

//    UserServiceInterface userService = new UserServiceImpl();
//    userService.addUser("user1");

//    UserServiceInterface userService = new UserServiceImplProxy();
//    userService.addUser("user1");

//        UserServiceInterface userService = (UserServiceInterface) JDKEnhancer.getService(UserServiceInterface.class);
        UserServiceInterface userService = (UserServiceImpl) CglibEnhancer.getService(UserServiceImpl.class);

        //区别1：JDK的Proxy来实现代理需要有接口，Cglib不需要，所以Cglib更加方便；
        //区别2：JDK的Proxy是通过反射机制来调用，Cglib是通过生成子类代码的方式进行调用，所以Cglib的性能更好；

        //Cglib是通过生成子类的方式来实现调用，final的方法不能被子类覆写；

        userService.addUser("user1");
        System.out.println(userService.getClass().getName());

//    System.out.println("\n--------\n");
//
//    UserServiceInterface userService1 = (UserServiceInterface) Proxy
//        .newProxyInstance(ProxyTest.class.getClassLoader(), new Class[]{UserServiceInterface.class},
//            new UserServiceInvocation());
//    userService1.addUser("user2");
//    System.out.println(userService1.getClass().getName());
    }

//  static class UserServiceInvocation implements InvocationHandler {
//
//    UserServiceImpl userService;
//
//    public UserServiceInvocation() {
//      userService = new UserServiceImpl();
//    }
//
//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
////      System.out.println("method ========== " + method.getName());
//      if ("addUser".equals(method.getName())) {
//        System.out.println("准备相关资料");
//      }
//      Object object = method.invoke(userService, args);
//      if ("addUser".equals(method.getName())) {
//        System.out.println("通知各个模块");
//      }
//      return object;
//    }
//  }
}
