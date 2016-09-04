package com.hxgsn.model;

import com.jfinal.plugin.activerecord.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zgc on 16-9-3.
 */
public class UserService {

    private static final UserModel DAO = new UserModel();

    public static UserModel findById(Object id) {
        return DAO.findById(id);
    }

    public static UserModel findByMobile(String mobile) {
        String sql = "select * from tb_user where mobile = ?";
        return DAO.findFirst(sql, mobile);
    }

    public static List<UserModel> findBySex(int sex) {
        String sql = "select * from tb_user where sex = ?";
        return DAO.find(sql, sex);
    }

    public static List<UserModel> find(Integer sex, String name, String address, String mobile) {
        StringBuffer sql = new StringBuffer("select * from tb_user");
        List<Object> params = new ArrayList<>();
        boolean addWhere = false;
        addWhere = AppendField(sex, "sex", sql, params, addWhere);
        addWhere = AppendFieldLike(name, "name", sql, params, addWhere);
        addWhere = AppendFieldLike(address, "address", sql, params, addWhere);
        AppendFieldLike(mobile, "mobile", sql, params, addWhere);
        return DAO.find(sql.toString(), params.toArray());
    }

    public static Page<UserModel> paginate(int page, int pageSize, Integer sex, String name, String address, String mobile) {
        String select = "select *";
        StringBuffer sqlExceptSelect = new StringBuffer(" from tb_user");
        List<Object> params = new ArrayList<>();
        boolean addWhere = false;
        addWhere = AppendField(sex, "sex", sqlExceptSelect, params, addWhere);
        addWhere = AppendFieldLike(name, "name", sqlExceptSelect, params, addWhere);
        addWhere = AppendFieldLike(address, "address", sqlExceptSelect, params, addWhere);
        AppendFieldLike(mobile, "mobile", sqlExceptSelect, params, addWhere);
        return DAO.paginate(page, pageSize, select, sqlExceptSelect.toString(), params.toArray());
    }

    private static boolean AppendField(Object data, String filed, StringBuffer sql, List<Object> params, boolean addWhere) {
        if (data != null) {
            if (addWhere == false) {
                sql.append(" where");
                addWhere = true;
            } else {
                sql.append(" and");
            }
            sql.append(" " + filed + " = ?");
            params.add(data);
        }
        return addWhere;
    }

    private static boolean AppendFieldLike(Object data, String filed, StringBuffer sql, List<Object> params, boolean addWhere) {
        if (data != null) {
            if (addWhere == false) {
                sql.append(" where");
                addWhere = true;
            } else {
                sql.append(" and");
            }
            sql.append(" " + filed + " like ?");
            params.add("%" + data + "%");
        }
        return addWhere;
    }
}
