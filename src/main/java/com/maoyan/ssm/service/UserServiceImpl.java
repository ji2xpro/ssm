package com.maoyan.ssm.service;

import com.maoyan.ssm.dao.UserMapper;
import com.maoyan.ssm.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: maoyan
 * @Date: 2018/8/10 15:09
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
