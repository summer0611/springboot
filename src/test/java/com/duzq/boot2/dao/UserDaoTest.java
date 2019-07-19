package com.duzq.boot2.dao;

import com.alibaba.fastjson.JSONObject;
import com.duzq.boot2.Boot2Application;
import com.duzq.boot2.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Boot2Application.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testGetUserList() {
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(JSONObject.toJSON(user));
        }
    }

}
