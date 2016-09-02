package com.hxgsn.model;

/**
 * Created by zgc on 16-9-3.
 */
public class UserService {

    private static final UserModel DAO = new UserModel();

    public static UserModel findById(Object id) {
        return DAO.findById(id);
    }
}
