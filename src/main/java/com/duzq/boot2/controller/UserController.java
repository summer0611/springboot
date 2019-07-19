package com.duzq.boot2.controller;

import com.duzq.boot2.dao.UserDao;
import com.duzq.boot2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/getUserList")
    public Object getUserList(User user){

        List<Map<String, Object>> userListMap = userDao.getUserListMap();
        List<User> userList = userDao.getUserList();
        List<Object> res = new ArrayList<>();
        res.add(userListMap);
        res.add(userList);
        return res;
    }
}
