package com.hxgsn.proxy;

/**
 * Created by zgc on 17-1-3.
 */
public class UserServiceImpl implements UserServiceInterface {

  @Override
  public void addUser(String name) {
    System.out.println("UserServiceImpl addUser");
  }

  @Override
  public void delUser(String name) {
    System.out.println("UserServiceImpl delUser");
  }
}
