package com.mapper;

import com.pojo.User;

import java.util.List;

/**
 * Created by mengbw on 2019/6/16.
 */
public interface UserMapper {
    List<User> findAll();
}
