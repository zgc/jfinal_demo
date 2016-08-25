package com.hxgsn.demo;

import com.jfinal.plugin.activerecord.Model;

/**
 * Created by zgc on 16-8-25.
 */
public class UserModel extends Model<UserModel> {

    public static final UserModel DAO = new UserModel();
}
