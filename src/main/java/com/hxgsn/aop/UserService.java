package com.hxgsn.aop;

import com.hxgsn.interceptor.AOPInterceptor;
import com.jfinal.aop.Before;
import com.jfinal.plugin.activerecord.tx.Tx;

/**
 * Created by zgc on 17-1-3.
 */
public class UserService {

  @Before(AOPInterceptor.class)
  public void deleteUser(String userId) {
    System.out.println("doDelete user by Id :" + userId);
  }

  @Before(Tx.class)
  public void saveUser(String userId) {
    System.out.println("doSave user by Id :" + userId);
  }
}
