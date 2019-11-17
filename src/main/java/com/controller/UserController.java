package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by mengbw on 2019/6/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/allUser", method = RequestMethod.GET)
    public String getUser() {
        List<User> userList = userService.findAll();
        for (User user : userList) {
            System.out.println(user.getUsername());
        }
        return "home";
    }
}
