package com.lee.dao;

import com.lee.entity.User;

import java.util.List;

/**
 * Created by android on 2017/6/28.
 */
public interface UserDao {

    User queryById(int userId);

    User queryByName(String userName);

    List<User> queryAll();

    int addUser(User user);

    int deleteById(int userId);

}
