package com.springmvc.service;

import com.springmvc.entity.User;

import java.util.ArrayList;

public interface UserService {

    int insert(User record);
     User selectSelective(Integer id);

}
