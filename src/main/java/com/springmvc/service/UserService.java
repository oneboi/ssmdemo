package com.springmvc.service;

import com.springmvc.entity.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {

    int insert(User record);
    User selectSelective(Integer id);
    List<User> select();
}

