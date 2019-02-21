package com.maoyan.ssm.service;

import com.maoyan.ssm.dao.*;
import com.maoyan.ssm.dao.aop.DynamicSwitchDataSource;
import com.maoyan.ssm.model.ConfigTest;
import com.maoyan.ssm.model.User;
import com.maoyan.ssm.model.UserTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: maoyan
 * @Date: 2018/8/10 15:09
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserTestMapper userTestMapper;

    @Autowired
    private ConfigTestMapper configTestMapper;

    @Override
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    @DynamicSwitchDataSource(dataSource = DataSources.MASTER)
    public List<UserTest> getAllUser() {
        return userTestMapper.selectAllUser();
    }

    @Override
    @DynamicSwitchDataSource(dataSource = DataSources.SLAVE)
    public List<ConfigTest> getAll() {
        return configTestMapper.selectAll();
    }
}
