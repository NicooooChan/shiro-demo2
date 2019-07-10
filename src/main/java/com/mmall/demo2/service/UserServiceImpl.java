package com.mmall.demo2.service;

import com.mmall.demo2.mapper.UserMapper;
import com.mmall.demo2.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 陈急舟
 * @description
 * @ClassName: UserServiceImpl
 * @date 2019/7/10 11:42
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}