package com.mmall.demo2.mapper;

import com.mmall.demo2.model.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author 陈急舟
 * @description
 * @ClassName: UserMapper
 * @date 2019/7/10 11:40
 */
public interface UserMapper {

    User findByUsername(@Param("username") String username);
}