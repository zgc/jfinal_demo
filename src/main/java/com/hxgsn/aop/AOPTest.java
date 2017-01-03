package com.hxgsn.aop;

import com.hxgsn.interceptor.AOPInterceptor;
import com.jfinal.aop.Duang;
import com.jfinal.aop.Enhancer;

/**
 * Created by zgc on 17-1-3.
 */
public class AOPTest {

  public static void main(String[] args) {
//    UserService userService = Enhancer.enhance(UserService.class);
//    userService.deleteUser("user1");
//    System.out.println(userService);
//
//    userService = Enhancer.enhance(UserService.class);
//    System.out.println(userService);

    UserService userService = Enhancer.enhance("test", UserService.class);
    System.out.println(userService);

    userService = Enhancer.enhance("test", UserService.class);
    System.out.println(userService);

//    Enhancer.enhance(UserService.class, AOPInterceptor.class);

//    Duang.duang(UserService.class);

//    UserService userService1 = new UserService();
//    userService1.deleteUser("user2");

//    System.out.println(userService.getClass());
//    System.out.println(userService1.getClass());
  }
}
