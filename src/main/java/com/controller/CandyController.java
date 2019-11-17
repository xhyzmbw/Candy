package com.controller;

import com.pojo.Candy;
import com.pojo.User;
import com.service.CandyService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mengbw on 2019/6/19.
 */
@RestController
@RequestMapping("/candy")
public class CandyController {
    @Autowired
    CandyService candyService;

    @RequestMapping("/allCandy")
    public String getCandy() {
        StringBuilder titles = new StringBuilder();
        List<Candy> candys = candyService.findAll();
        for (Candy candy : candys) {
            titles = titles.append(candy.getTitle());
        }
        return titles.toString();
    }
}
