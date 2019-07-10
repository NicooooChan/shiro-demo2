package com.mmall.demo2.service;

import com.mmall.demo2.model.User;

/**
 * @author 陈急舟
 * @description
 * @ClassName: UserService
 * @date 2019/7/10 11:41
 */
public interface UserService {

    User findByUsername(String username);
}