package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.util.Encryption;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpSession;
@Controller
public class UserController {


    /**
     * 注册页面
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(){
        return  "register";
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String addUser(Model model, @ModelAttribute User user) {

        User record= new User();
        record.setName(user.getName());
        record.setPassword(Encryption.MD5(user.getPassword()));
        return "register";


    }





    /**
     * 登陆页面
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return  "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginValidate(HttpSession session, Model model, @ModelAttribute User user) {

        User record= new User();
        record.setName(user.getName());
        record.setPassword(Encryption.MD5(user.getPassword()));

        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.invalidate();
        //session.removeAttribute("user");
        return "login";
    }




}
