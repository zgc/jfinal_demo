package com.hxgsn.proxy;

/**
 * Created by zgc on 17-1-3.
 */
public class UserServiceImplProxy implements UserServiceInterface {

  UserServiceImpl userService;

  public UserServiceImplProxy() {
    this.userService = new UserServiceImpl();
  }

  @Override
  public void addUser(String name) {
    System.out.println("准备添加用户相关资料");
    userService.addUser(name);
    System.out.println("通知各个模块，有新的用户添加啦");
  }

  @Override
  public void delUser(String name) {

  }
}
