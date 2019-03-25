package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class IndexController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/userlist")
    public  @ResponseBody  List<User>  select(){

        List<User> select = userService.select();
        return select;
    }

}
