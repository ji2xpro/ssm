package com.maoyan.ssm.service;

import com.maoyan.ssm.model.ConfigTest;
import com.maoyan.ssm.model.User;
import com.maoyan.ssm.model.UserTest;

import java.util.List;

/**
 * @Auther: maoyan
 * @Date: 2018/8/10 15:07
 * @Description:
 */
public interface UserService {
    User getUserById(int userId);


    List<UserTest> getAllUser();

    List<ConfigTest> getAll();
}
