package com.duzq.boot2.dao;

import com.duzq.boot2.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    /**
     * 获取用户信息
     * @param user
     * @return
     */
    List<User> getUserList();

    List<Map<String, Object>> getUserListMap();
}
