package com.xxx.yyy.ssm.service;

import com.xxx.yyy.ssm.dao.DataSources;
import com.xxx.yyy.ssm.dao.UserMasterMapper;
import com.xxx.yyy.ssm.dao.UserSlaveMapper;
import com.xxx.yyy.ssm.dao.aop.DynamicSwitchDataSource;
import com.xxx.yyy.ssm.model.UserMaster;
import com.xxx.yyy.ssm.model.UserSlave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther: maoyan
 * @date: 2018/8/10 15:09
 * @description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMasterMapper userMasterMapper;

    @Autowired
    private UserSlaveMapper userSlaveMapper;

    @Override
    public UserMaster getUserById(int userId) {
        return userMasterMapper.selectByPrimaryKey(userId);
    }

    @Override
    @DynamicSwitchDataSource(dataSource = DataSources.MASTER)
    public List<UserMaster> getAllUserMaster() {
        return userMasterMapper.selectAllUserMaster();
    }

    @Override
    @DynamicSwitchDataSource(dataSource = DataSources.SLAVE)
    public List<UserSlave> getAllUserSlave() {
        return userSlaveMapper.selectAllUserSlave();
    }
}
