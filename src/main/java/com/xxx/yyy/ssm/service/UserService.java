package com.xxx.yyy.ssm.service;

import com.xxx.yyy.ssm.model.UserMaster;
import com.xxx.yyy.ssm.model.UserSlave;

import java.util.List;

/**
 * @auther: maoyan
 * @date: 2018/8/10 15:07
 * @description:
 */
public interface UserService {
    UserMaster getUserById(int userId);

    List<UserMaster> getAllUserMaster();

    List<UserSlave> getAllUserSlave();
}
