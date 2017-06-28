package com.lee.service.impl;

import com.lee.dao.UserDao;
import com.lee.entity.User;
import com.lee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by android on 2017/6/28.
 */
@Service
public class UserServiceImpl implements UserService {


    // 注入Service依赖
    @Autowired
    private UserDao userDao;

    public User queryById(int userId) {
        return userDao.queryById(userId);
    }

    public List<User> queryAll() {
        return userDao.queryAll();
    }

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public int deleteById(int userId) {
        return userDao.deleteById(userId);
    }
}
