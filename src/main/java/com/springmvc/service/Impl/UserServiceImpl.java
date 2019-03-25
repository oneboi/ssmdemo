package com.springmvc.service.Impl;

import com.springmvc.dao.UserMapper;
import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    public int insert(User record) {
        return mapper.insert(record);
    }

    public  User selectSelective(Integer id) {
        return mapper.selectByPrimaryKey(id );
    }
    public List<User> select() {

        System.out.println("user service");

        return mapper.selectUserList();

    }


}

