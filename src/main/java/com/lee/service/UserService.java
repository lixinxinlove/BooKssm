package com.lee.service;

import com.lee.entity.User;

import java.util.List;

/**
 * Created by android on 2017/6/28.
 */
public interface UserService {

    User queryById(int userId);

    List<User> queryAll();

    int addUser(User user);

    int deleteById(int userId);
}
